package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ContractEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/procurement/015_contract/Contract_SQL.xml";
    public HashMap insertContract(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ContractEJBDAO.InsertContract", param);
    }
    public Collection selectContractList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ContractEJBDAO.SelectContractList", param);
    }
    public HashMap selectContractDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ContractEJBDAO.SelectContractDetail", param);
    }
    public HashMap updateContract(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ContractEJBDAO.UpdateContract", param);
    }
    public HashMap deleteContract(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ContractEJBDAO.DeleteContract", param);
    }
}