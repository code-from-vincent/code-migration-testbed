package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ReturnOrderLocal extends EJBLocalObject {
    HashMap insertReturnOrder(DefaultParameters param) throws DefaultEJBException;
    Collection selectReturnOrderList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectReturnOrderDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateReturnOrder(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteReturnOrder(DefaultParameters param) throws DefaultEJBException;
}