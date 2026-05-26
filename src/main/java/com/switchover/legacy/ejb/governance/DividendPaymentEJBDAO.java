package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class DividendPaymentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/governance/183_dividendpayment/DividendPayment_SQL.xml";
    public HashMap insertDividendPayment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DividendPaymentEJBDAO.InsertDividendPayment", param);
    }
    public Collection selectDividendPaymentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "DividendPaymentEJBDAO.SelectDividendPaymentList", param);
    }
    public HashMap selectDividendPaymentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DividendPaymentEJBDAO.SelectDividendPaymentDetail", param);
    }
    public HashMap updateDividendPayment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DividendPaymentEJBDAO.UpdateDividendPayment", param);
    }
    public HashMap deleteDividendPayment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DividendPaymentEJBDAO.DeleteDividendPayment", param);
    }
}