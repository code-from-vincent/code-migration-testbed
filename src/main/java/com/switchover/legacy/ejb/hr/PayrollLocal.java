package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PayrollLocal extends EJBLocalObject {
    HashMap insertPayroll(DefaultParameters param) throws DefaultEJBException;
    Collection selectPayrollList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPayrollDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePayroll(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePayroll(DefaultParameters param) throws DefaultEJBException;
}