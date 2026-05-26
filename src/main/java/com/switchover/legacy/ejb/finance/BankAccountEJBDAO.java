package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class BankAccountEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/110_bankaccount/BankAccount_SQL.xml";
    public HashMap insertBankAccount(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BankAccountEJBDAO.InsertBankAccount", param);
    }
    public Collection selectBankAccountList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "BankAccountEJBDAO.SelectBankAccountList", param);
    }
    public HashMap selectBankAccountDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BankAccountEJBDAO.SelectBankAccountDetail", param);
    }
    public HashMap updateBankAccount(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BankAccountEJBDAO.UpdateBankAccount", param);
    }
    public HashMap deleteBankAccount(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BankAccountEJBDAO.DeleteBankAccount", param);
    }
}