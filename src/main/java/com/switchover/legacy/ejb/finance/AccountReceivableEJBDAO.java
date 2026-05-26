package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class AccountReceivableEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/117_accountreceivable/AccountReceivable_SQL.xml";
    public HashMap insertAccountReceivable(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AccountReceivableEJBDAO.InsertAccountReceivable", param);
    }
    public Collection selectAccountReceivableList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "AccountReceivableEJBDAO.SelectAccountReceivableList", param);
    }
    public HashMap selectAccountReceivableDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AccountReceivableEJBDAO.SelectAccountReceivableDetail", param);
    }
    public HashMap updateAccountReceivable(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AccountReceivableEJBDAO.UpdateAccountReceivable", param);
    }
    public HashMap deleteAccountReceivable(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AccountReceivableEJBDAO.DeleteAccountReceivable", param);
    }
}