package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface LeaveRequestLocal extends EJBLocalObject {
    HashMap insertLeaveRequest(DefaultParameters param) throws DefaultEJBException;
    Collection selectLeaveRequestList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectLeaveRequestDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateLeaveRequest(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteLeaveRequest(DefaultParameters param) throws DefaultEJBException;
}