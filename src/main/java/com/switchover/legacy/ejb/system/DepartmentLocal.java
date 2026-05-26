package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface DepartmentLocal extends EJBLocalObject {
    HashMap insertDepartment(DefaultParameters param) throws DefaultEJBException;
    Collection selectDepartmentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectDepartmentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateDepartment(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteDepartment(DefaultParameters param) throws DefaultEJBException;
}