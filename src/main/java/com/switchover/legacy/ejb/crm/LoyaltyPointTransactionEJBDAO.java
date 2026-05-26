package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class LoyaltyPointTransactionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/crm/091_loyaltypointtransaction/LoyaltyPointTransaction_SQL.xml";
    public HashMap insertLoyaltyPointTransaction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LoyaltyPointTransactionEJBDAO.InsertLoyaltyPointTransaction", param);
    }
    public Collection selectLoyaltyPointTransactionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "LoyaltyPointTransactionEJBDAO.SelectLoyaltyPointTransactionList", param);
    }
    public HashMap selectLoyaltyPointTransactionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LoyaltyPointTransactionEJBDAO.SelectLoyaltyPointTransactionDetail", param);
    }
    public HashMap updateLoyaltyPointTransaction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LoyaltyPointTransactionEJBDAO.UpdateLoyaltyPointTransaction", param);
    }
    public HashMap deleteLoyaltyPointTransaction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LoyaltyPointTransactionEJBDAO.DeleteLoyaltyPointTransaction", param);
    }
}