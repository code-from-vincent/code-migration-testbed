package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class AccountPayableEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/116_accountpayable/AccountPayable_SQL.xml";
    public HashMap insertAccountPayable(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AccountPayableEJBDAO.InsertAccountPayable", param);
    }
    public Collection selectAccountPayableList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "AccountPayableEJBDAO.SelectAccountPayableList", param);
    }
    public HashMap selectAccountPayableDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AccountPayableEJBDAO.SelectAccountPayableDetail", param);
    }
    public HashMap updateAccountPayable(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AccountPayableEJBDAO.UpdateAccountPayable", param);
    }
    public HashMap deleteAccountPayable(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AccountPayableEJBDAO.DeleteAccountPayable", param);
    }
}