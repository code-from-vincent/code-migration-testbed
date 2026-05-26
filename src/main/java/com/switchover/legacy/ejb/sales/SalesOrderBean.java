package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SalesOrderBean extends DefaultSession {
    private final SalesOrderEJBDAO salesOrderEJBDAO = new SalesOrderEJBDAO();
    public HashMap insertSalesOrder(DefaultParameters param) throws DefaultEJBException {
        return salesOrderEJBDAO.insertSalesOrder(param);
    }
    public Collection selectSalesOrderList(DefaultParameters param) throws DefaultEJBException {
        return salesOrderEJBDAO.selectSalesOrderList(param);
    }
    public HashMap selectSalesOrderDetail(DefaultParameters param) throws DefaultEJBException {
        return salesOrderEJBDAO.selectSalesOrderDetail(param);
    }
    public HashMap updateSalesOrder(DefaultParameters param) throws DefaultEJBException {
        return salesOrderEJBDAO.updateSalesOrder(param);
    }
    public HashMap deleteSalesOrder(DefaultParameters param) throws DefaultEJBException {
        return salesOrderEJBDAO.deleteSalesOrder(param);
    }
}