package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface TrademarkLocal extends EJBLocalObject {
    HashMap insertTrademark(DefaultParameters param) throws DefaultEJBException;
    Collection selectTrademarkList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectTrademarkDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateTrademark(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteTrademark(DefaultParameters param) throws DefaultEJBException;
}