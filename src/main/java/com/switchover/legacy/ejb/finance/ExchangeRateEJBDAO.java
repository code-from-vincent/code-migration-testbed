package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ExchangeRateEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/109_exchangerate/ExchangeRate_SQL.xml";
    public HashMap insertExchangeRate(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ExchangeRateEJBDAO.InsertExchangeRate", param);
    }
    public Collection selectExchangeRateList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ExchangeRateEJBDAO.SelectExchangeRateList", param);
    }
    public HashMap selectExchangeRateDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ExchangeRateEJBDAO.SelectExchangeRateDetail", param);
    }
    public HashMap updateExchangeRate(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ExchangeRateEJBDAO.UpdateExchangeRate", param);
    }
    public HashMap deleteExchangeRate(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ExchangeRateEJBDAO.DeleteExchangeRate", param);
    }
}