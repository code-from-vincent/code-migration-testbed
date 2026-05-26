package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ProfitCenterEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/115_profitcenter/ProfitCenter_SQL.xml";
    public HashMap insertProfitCenter(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProfitCenterEJBDAO.InsertProfitCenter", param);
    }
    public Collection selectProfitCenterList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ProfitCenterEJBDAO.SelectProfitCenterList", param);
    }
    public HashMap selectProfitCenterDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProfitCenterEJBDAO.SelectProfitCenterDetail", param);
    }
    public HashMap updateProfitCenter(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProfitCenterEJBDAO.UpdateProfitCenter", param);
    }
    public HashMap deleteProfitCenter(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProfitCenterEJBDAO.DeleteProfitCenter", param);
    }
}