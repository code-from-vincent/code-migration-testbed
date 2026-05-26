package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ShareholderEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/governance/182_shareholder/Shareholder_SQL.xml";
    public HashMap insertShareholder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ShareholderEJBDAO.InsertShareholder", param);
    }
    public Collection selectShareholderList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ShareholderEJBDAO.SelectShareholderList", param);
    }
    public HashMap selectShareholderDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ShareholderEJBDAO.SelectShareholderDetail", param);
    }
    public HashMap updateShareholder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ShareholderEJBDAO.UpdateShareholder", param);
    }
    public HashMap deleteShareholder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ShareholderEJBDAO.DeleteShareholder", param);
    }
}