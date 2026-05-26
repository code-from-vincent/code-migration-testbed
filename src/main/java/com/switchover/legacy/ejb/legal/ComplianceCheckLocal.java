package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ComplianceCheckLocal extends EJBLocalObject {
    HashMap insertComplianceCheck(DefaultParameters param) throws DefaultEJBException;
    Collection selectComplianceCheckList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectComplianceCheckDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateComplianceCheck(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteComplianceCheck(DefaultParameters param) throws DefaultEJBException;
}