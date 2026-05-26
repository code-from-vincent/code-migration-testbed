package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ContractChangeEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/procurement/123_contractchange/ContractChange_SQL.xml";
    public HashMap insertContractChange(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ContractChangeEJBDAO.InsertContractChange", param);
    }
    public Collection selectContractChangeList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ContractChangeEJBDAO.SelectContractChangeList", param);
    }
    public HashMap selectContractChangeDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ContractChangeEJBDAO.SelectContractChangeDetail", param);
    }
    public HashMap updateContractChange(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ContractChangeEJBDAO.UpdateContractChange", param);
    }
    public HashMap deleteContractChange(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ContractChangeEJBDAO.DeleteContractChange", param);
    }
}