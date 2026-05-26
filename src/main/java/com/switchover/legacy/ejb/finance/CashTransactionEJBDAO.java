package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CashTransactionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/111_cashtransaction/CashTransaction_SQL.xml";
    public HashMap insertCashTransaction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CashTransactionEJBDAO.InsertCashTransaction", param);
    }
    public Collection selectCashTransactionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CashTransactionEJBDAO.SelectCashTransactionList", param);
    }
    public HashMap selectCashTransactionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CashTransactionEJBDAO.SelectCashTransactionDetail", param);
    }
    public HashMap updateCashTransaction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CashTransactionEJBDAO.UpdateCashTransaction", param);
    }
    public HashMap deleteCashTransaction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CashTransactionEJBDAO.DeleteCashTransaction", param);
    }
}