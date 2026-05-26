package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PaymentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/020_payment/Payment_SQL.xml";
    public HashMap insertPayment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PaymentEJBDAO.InsertPayment", param);
    }
    public Collection selectPaymentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PaymentEJBDAO.SelectPaymentList", param);
    }
    public HashMap selectPaymentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PaymentEJBDAO.SelectPaymentDetail", param);
    }
    public HashMap updatePayment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PaymentEJBDAO.UpdatePayment", param);
    }
    public HashMap deletePayment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PaymentEJBDAO.DeletePayment", param);
    }
}