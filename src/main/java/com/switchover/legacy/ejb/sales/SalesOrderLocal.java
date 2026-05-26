package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SalesOrderLocal extends EJBLocalObject {
    HashMap insertSalesOrder(DefaultParameters param) throws DefaultEJBException;
    Collection selectSalesOrderList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSalesOrderDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSalesOrder(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSalesOrder(DefaultParameters param) throws DefaultEJBException;
}