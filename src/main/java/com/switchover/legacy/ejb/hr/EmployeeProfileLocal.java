package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface EmployeeProfileLocal extends EJBLocalObject {
    HashMap insertEmployeeProfile(DefaultParameters param) throws DefaultEJBException;
    Collection selectEmployeeProfileList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectEmployeeProfileDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateEmployeeProfile(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteEmployeeProfile(DefaultParameters param) throws DefaultEJBException;
}