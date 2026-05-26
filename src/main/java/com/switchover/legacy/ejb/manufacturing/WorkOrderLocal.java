package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface WorkOrderLocal extends EJBLocalObject {
    HashMap insertWorkOrder(DefaultParameters param) throws DefaultEJBException;
    Collection selectWorkOrderList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectWorkOrderDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateWorkOrder(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteWorkOrder(DefaultParameters param) throws DefaultEJBException;
}