package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class EmployeeProfileBean extends DefaultSession {
    private final EmployeeProfileEJBDAO employeeProfileEJBDAO = new EmployeeProfileEJBDAO();
    public HashMap insertEmployeeProfile(DefaultParameters param) throws DefaultEJBException {
        return employeeProfileEJBDAO.insertEmployeeProfile(param);
    }
    public Collection selectEmployeeProfileList(DefaultParameters param) throws DefaultEJBException {
        return employeeProfileEJBDAO.selectEmployeeProfileList(param);
    }
    public HashMap selectEmployeeProfileDetail(DefaultParameters param) throws DefaultEJBException {
        return employeeProfileEJBDAO.selectEmployeeProfileDetail(param);
    }
    public HashMap updateEmployeeProfile(DefaultParameters param) throws DefaultEJBException {
        return employeeProfileEJBDAO.updateEmployeeProfile(param);
    }
    public HashMap deleteEmployeeProfile(DefaultParameters param) throws DefaultEJBException {
        return employeeProfileEJBDAO.deleteEmployeeProfile(param);
    }
}