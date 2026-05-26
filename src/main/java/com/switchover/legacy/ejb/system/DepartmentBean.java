package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class DepartmentBean extends DefaultSession {
    private final DepartmentEJBDAO departmentEJBDAO = new DepartmentEJBDAO();
    public HashMap insertDepartment(DefaultParameters param) throws DefaultEJBException {
        return departmentEJBDAO.insertDepartment(param);
    }
    public Collection selectDepartmentList(DefaultParameters param) throws DefaultEJBException {
        return departmentEJBDAO.selectDepartmentList(param);
    }
    public HashMap selectDepartmentDetail(DefaultParameters param) throws DefaultEJBException {
        return departmentEJBDAO.selectDepartmentDetail(param);
    }
    public HashMap updateDepartment(DefaultParameters param) throws DefaultEJBException {
        return departmentEJBDAO.updateDepartment(param);
    }
    public HashMap deleteDepartment(DefaultParameters param) throws DefaultEJBException {
        return departmentEJBDAO.deleteDepartment(param);
    }
}