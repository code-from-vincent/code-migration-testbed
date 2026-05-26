package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ComplianceCheckBean extends DefaultSession {
    private final ComplianceCheckEJBDAO complianceCheckEJBDAO = new ComplianceCheckEJBDAO();
    public HashMap insertComplianceCheck(DefaultParameters param) throws DefaultEJBException {
        return complianceCheckEJBDAO.insertComplianceCheck(param);
    }
    public Collection selectComplianceCheckList(DefaultParameters param) throws DefaultEJBException {
        return complianceCheckEJBDAO.selectComplianceCheckList(param);
    }
    public HashMap selectComplianceCheckDetail(DefaultParameters param) throws DefaultEJBException {
        return complianceCheckEJBDAO.selectComplianceCheckDetail(param);
    }
    public HashMap updateComplianceCheck(DefaultParameters param) throws DefaultEJBException {
        return complianceCheckEJBDAO.updateComplianceCheck(param);
    }
    public HashMap deleteComplianceCheck(DefaultParameters param) throws DefaultEJBException {
        return complianceCheckEJBDAO.deleteComplianceCheck(param);
    }
}