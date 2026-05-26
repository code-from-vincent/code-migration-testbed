package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class TrademarkBean extends DefaultSession {
    private final TrademarkEJBDAO trademarkEJBDAO = new TrademarkEJBDAO();
    public HashMap insertTrademark(DefaultParameters param) throws DefaultEJBException {
        return trademarkEJBDAO.insertTrademark(param);
    }
    public Collection selectTrademarkList(DefaultParameters param) throws DefaultEJBException {
        return trademarkEJBDAO.selectTrademarkList(param);
    }
    public HashMap selectTrademarkDetail(DefaultParameters param) throws DefaultEJBException {
        return trademarkEJBDAO.selectTrademarkDetail(param);
    }
    public HashMap updateTrademark(DefaultParameters param) throws DefaultEJBException {
        return trademarkEJBDAO.updateTrademark(param);
    }
    public HashMap deleteTrademark(DefaultParameters param) throws DefaultEJBException {
        return trademarkEJBDAO.deleteTrademark(param);
    }
}