package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class FranchiseContractEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/facility/089_franchisecontract/FranchiseContract_SQL.xml";
    public HashMap insertFranchiseContract(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FranchiseContractEJBDAO.InsertFranchiseContract", param);
    }
    public Collection selectFranchiseContractList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "FranchiseContractEJBDAO.SelectFranchiseContractList", param);
    }
    public HashMap selectFranchiseContractDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FranchiseContractEJBDAO.SelectFranchiseContractDetail", param);
    }
    public HashMap updateFranchiseContract(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FranchiseContractEJBDAO.UpdateFranchiseContract", param);
    }
    public HashMap deleteFranchiseContract(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FranchiseContractEJBDAO.DeleteFranchiseContract", param);
    }
}