package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class TrademarkEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/legal/126_trademark/Trademark_SQL.xml";
    public HashMap insertTrademark(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrademarkEJBDAO.InsertTrademark", param);
    }
    public Collection selectTrademarkList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "TrademarkEJBDAO.SelectTrademarkList", param);
    }
    public HashMap selectTrademarkDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrademarkEJBDAO.SelectTrademarkDetail", param);
    }
    public HashMap updateTrademark(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrademarkEJBDAO.UpdateTrademark", param);
    }
    public HashMap deleteTrademark(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrademarkEJBDAO.DeleteTrademark", param);
    }
}