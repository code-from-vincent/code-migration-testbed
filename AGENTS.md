# AGENTS.md

## Project Overview

`code-migration-testbed` is a **legacy J2EE migration testbed** that simulates a classic SOME-based enterprise system (`kr.some.cmm.*`). It contains **200 domain business units** written in Java 1.8 with Apache Struts 1.x + EJB patterns (no Spring, no MyBatis). The goal is to serve as a migration source for modernization efforts.

See `WORK_UNITS_200.md` for the full list of all 200 domain entities with their table names, EJB interfaces, Actions, and XML query paths.

---

## Architecture: 3-Layer J2EE Pattern

Each of the 200 domains follows the exact same structure:

| Layer          | Package                            | Base Class                         | Role                                                    |
|----------------|------------------------------------|------------------------------------|---------------------------------------------------------|
| Web (Action)   | `com.switchover.legacy.web.action` | `kr.some.cmm.web.DefaultAction`    | Struts Action – delegates to EJB via `invokeLocal(req)` |
| Business (EJB) | `com.switchover.legacy.ejb`        | `kr.some.cmm.frame.DefaultSession` | EJB Session Bean interface                              |
| Data Access    | `src/main/resources/xml_query/`    | Custom NTIS XML format             | Raw SQL queries referenced by EJB DAO                   |

**Data flow:** HTTP Request → `*Action.invokeLocal(req)` → EJB → `*EJBDAO` → XML query → Oracle DB

---

## Key Conventions

### EJB Interface (`com.switchover.legacy.ejb.Foo`)
Each EJB interface declares exactly 5 methods using `DefaultParameters` (input) and raw `HashMap`/`Collection` (output):
```java
HashMap insertFoo(DefaultParameters param) throws RemoteException, DefaultEJBException;
Collection selectFooList(DefaultParameters param) throws RemoteException, DefaultEJBException;
HashMap selectFooDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
HashMap updateFoo(DefaultParameters param) throws RemoteException, DefaultEJBException;
HashMap deleteFoo(DefaultParameters param) throws RemoteException, DefaultEJBException;
```

### Struts Action (`com.switchover.legacy.web.action.FooAction`)
Each Action class wraps the EJB result and sets it as a request attribute:
- **List**: `req.setAttribute("fooList", list == null ? new ArrayList() : list)`
- **Detail**: `req.setAttribute("fooDetail", hm.get("fooDetail"))`
- **Insert/Update/Delete**: `req.setAttribute("result", (HashMap) invokeLocal(req))`

### XML Query Files (`src/main/resources/xml_query/NNN_foo/Foo_SQL.xml`)
- **Encoding**: `EUC-KR` (Korean legacy — never change to UTF-8 without coordinating DB migration)
- **Query ID format**: `FooEJBDAO.InsertFoo`, `FooEJBDAO.SelectFooList`, etc. (PascalCase operation)
- **Parameters**: Positional `?` with explicit `<param type="VARCHAR"/>` declarations
- **Table naming**: `TB_ENTITYNAME` (all uppercase)
- **Timestamps**: Oracle `SYSDATE` used directly in SQL (not passed as parameters)
- **Audit columns**: All tables include `CREATED_BY`, `CREATED_AT`, `UPDATED_BY`, `UPDATED_AT`

Example (`xml_query/001_useraccount/UserAccount_SQL.xml`):
```xml
<query id="UserAccountEJBDAO.InsertUserAccount">
  <statement><![CDATA[INSERT INTO TB_USERACCOUNT (..., CREATED_AT, UPDATED_AT)
    VALUES (?, ?, ?, ?, SYSDATE, ?, SYSDATE)]]></statement>
  <param type="VARCHAR"/>...
</query>
```

---

## File Naming & Directory Structure

```
src/main/java/com/switchover/legacy/
    ejb/{group}/           → {Domain}.java          (EJB interfaces, 200 files)
    web/action/{group}/    → {Domain}Action.java    (Struts actions, 200 files)

src/main/resources/xml_query/
    {group}/NNN_{module}/  → {Domain}_SQL.xml       (one XML per domain, numbered 001–200)
```

Related modules are grouped under a representative `{group}` name. The `{module}` name is the lowercase suffix of the xml_query directory (e.g., `001_useraccount` → `useraccount`).

All three layers share the same `{group}`, keeping EJB, Action, and SQL co-organized.

Example for `UserAccount` (group `system`, module `useraccount`):
- `system.ejb.com.switchover.legacy.UserAccount`
- `system.action.web.com.switchover.legacy.UserAccountAction`
- `xml_query/system/001_useraccount/UserAccount_SQL.xml`

### Group → Modules Mapping (26 groups)

| Group           | Modules (count)                                                                                                                                                                                                                                     |
|-----------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `system`        | useraccount, userrole, department, menu, codegroup, codedetail, accesspolicy, auditlog, systemconfig, holidaycalendar, region (11)                                                                                                                  |
| `hr`            | employeeprofile, trainingcourse, trainingenrollment, leaverequest, attendancerecord, payroll, performancereview, recruitmentposting, applicant, interviewschedule, trainingbudget, mentoringprogram (12)                                            |
| `project`       | project, projecttask, issueticket, changerequest, releaseplan, deploymenthistory, featureflag, actionitem (8)                                                                                                                                       |
| `document`      | notice, faq, document, documentapproval, meetingrecord, announcement, survey, surveyresponse, templatedocument, archiverecord, retentionpolicy (11)                                                                                                 |
| `procurement`   | vendor, contract, contractchange, purchaseorder, purchaseorderitem, procurementrequest, procurementbid, bidevaluation, procurementcatalog, supplierscorecard (10)                                                                                   |
| `sales`         | customer, customercontact, saleslead, opportunity, salesorder, shipment, returnorder, partner, partnersettlement (9)                                                                                                                                |
| `product`       | product, productcategory, pricepolicy, warehouse, inventory, stockadjustment, stocktransfer, qualityinspection, asset, assetmaintenance (10)                                                                                                        |
| `manufacturing` | productionplan, workorder, billofmaterial, manufacturingstep, machine, machinedowntime, safetyincident (7)                                                                                                                                          |
| `finance`       | invoice, payment, budgetplan, expensereport, taxinvoice, taxrate, exchangerate, bankaccount, cashtransaction, generalledger, journalentry, costcenter, profitcenter, accountpayable, accountreceivable, fixedassetdepreciation, yearendclosing (17) |
| `crm`           | loyaltyaccount, loyaltypointtransaction, coupon, promotioncampaign, marketingsegment, event (6)                                                                                                                                                     |
| `facility`      | facility, facilitybooking, reservation, seatallocation, branchoffice, store, franchisecontract, vehiclereservation (8)                                                                                                                              |
| `logistics`     | vehicle, fueltransaction, routeplan, deliveryassignment (4)                                                                                                                                                                                         |
| `itsm`          | supportrequest, servicelevelagreement, knowledgearticle, servicecatalog, servicerequest, incident, problemrecord, configurationitem, cmdbrelationship, knowledgecategory (10)                                                                       |
| `infra`         | apiclient, apiaccesslog, batchjob, batchexecutionhistory, integrationendpoint, integrationmessage, schedulertask, backupjob, restorejob, disasterrecoveryplan, capacityplan (11)                                                                    |
| `notification`  | notificationtemplate, notificationhistory, emailqueue, smsqueue, pushsubscription (5)                                                                                                                                                               |
| `report`        | dashboard, reportdefinition, reportexecution, dataexportjob, dataimportjob (5)                                                                                                                                                                      |
| `callcenter`    | callcenteragent, callrecord, chatsession, feedback, complaint, escalation, rootcauseanalysis, correctiveaction, preventiveaction (9)                                                                                                                |
| `security`      | usersession, loginhistory, passwordpolicy, securityincident, vulnerabilityreport, patchmanagement (6)                                                                                                                                               |
| `legal`         | legalcase, patent, trademark, compliancecheck, riskassessment (5)                                                                                                                                                                                   |
| `rd`            | researchproject, experimentrecord, sampleinventory, clinicaltrial (4)                                                                                                                                                                               |
| `healthcare`    | patientrecord, appointment, prescription, labresult, medicalclaim, insurancepolicy, policyclaim (7)                                                                                                                                                 |
| `governance`    | boardmeeting, shareholder, dividendpayment, mergeracquisition, strategicinitiative, kpidefinition, kpiresult, benchmark, scenarioplan (9)                                                                                                           |
| `privacy`       | datamaskingrule, consentrecord, privacyrequest, databreachreport, thirdpartyrisk (5)                                                                                                                                                                |
| `workflow`      | workflowdefinition, workflowinstance, workflowtask, approvalline, approvalrequest (5)                                                                                                                                                               |
| `csr`           | grantapplication, scholarshipaward, volunteeractivity, innovationidea (4)                                                                                                                                                                           |
| `esg`           | energyusage, carbonemission (2)                                                                                                                                                                                                                     |

The domain number prefix in the directory (e.g., `001_useraccount`) must match the order in `WORK_UNITS_200.md`.

---

## Build

```
mvn compile          # Java 1.8 source/target, no Spring Boot wrapper
mvn package          # Produces JAR (no runnable main – legacy container deployment)
```

No test sources exist in this testbed. 

---

## Adding a New Domain Unit

When adding a new domain (e.g., `FooBaz`, group `procurement`, module name `foobaz`):
1. Create `src/main/java/com/switchover/legacy/ejb/procurement/FooBaz.java` — package `com.switchover.legacy.ejb.procurement`, implement the 5-method EJB interface pattern
2. Create `src/main/java/com/switchover/legacy/web/action/procurement/FooBazAction.java` — package `com.switchover.legacy.web.action.procurement`, implement the 5-method Action pattern
3. Create `src/main/resources/xml_query/procurement/NNN_foobaz/FooBaz_SQL.xml` — use `EUC-KR` encoding, `TB_FOOBAZ` table name, and query IDs `FooBazEJBDAO.*`
4. Add an entry row to `WORK_UNITS_200.md`
