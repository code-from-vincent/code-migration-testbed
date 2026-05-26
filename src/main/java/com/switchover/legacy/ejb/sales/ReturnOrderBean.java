package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ReturnOrderBean extends DefaultSession {
    private final ReturnOrderEJBDAO returnOrderEJBDAO = new ReturnOrderEJBDAO();
    public HashMap insertReturnOrder(DefaultParameters param) throws DefaultEJBException {
        return returnOrderEJBDAO.insertReturnOrder(param);
    }
    public Collection selectReturnOrderList(DefaultParameters param) throws DefaultEJBException {
        return returnOrderEJBDAO.selectReturnOrderList(param);
    }
    public HashMap selectReturnOrderDetail(DefaultParameters param) throws DefaultEJBException {
        return returnOrderEJBDAO.selectReturnOrderDetail(param);
    }
    public HashMap updateReturnOrder(DefaultParameters param) throws DefaultEJBException {
        return returnOrderEJBDAO.updateReturnOrder(param);
    }
    public HashMap deleteReturnOrder(DefaultParameters param) throws DefaultEJBException {
        return returnOrderEJBDAO.deleteReturnOrder(param);
    }
}