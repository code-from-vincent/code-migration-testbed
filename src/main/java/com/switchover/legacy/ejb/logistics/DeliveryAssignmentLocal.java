package com.switchover.legacy.ejb.logistics;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface DeliveryAssignmentLocal extends EJBLocalObject {
    HashMap insertDeliveryAssignment(DefaultParameters param) throws DefaultEJBException;
    Collection selectDeliveryAssignmentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectDeliveryAssignmentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateDeliveryAssignment(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteDeliveryAssignment(DefaultParameters param) throws DefaultEJBException;
}