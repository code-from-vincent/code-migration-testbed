package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class GeneralLedgerEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/112_generalledger/GeneralLedger_SQL.xml";
    public HashMap insertGeneralLedger(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "GeneralLedgerEJBDAO.InsertGeneralLedger", param);
    }
    public Collection selectGeneralLedgerList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "GeneralLedgerEJBDAO.SelectGeneralLedgerList", param);
    }
    public HashMap selectGeneralLedgerDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "GeneralLedgerEJBDAO.SelectGeneralLedgerDetail", param);
    }
    public HashMap updateGeneralLedger(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "GeneralLedgerEJBDAO.UpdateGeneralLedger", param);
    }
    public HashMap deleteGeneralLedger(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "GeneralLedgerEJBDAO.DeleteGeneralLedger", param);
    }
}