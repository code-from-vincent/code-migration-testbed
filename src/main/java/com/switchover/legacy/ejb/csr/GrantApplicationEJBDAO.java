package com.switchover.legacy.ejb.csr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class GrantApplicationEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/csr/195_grantapplication/GrantApplication_SQL.xml";
    public HashMap insertGrantApplication(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "GrantApplicationEJBDAO.InsertGrantApplication", param);
    }
    public Collection selectGrantApplicationList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "GrantApplicationEJBDAO.SelectGrantApplicationList", param);
    }
    public HashMap selectGrantApplicationDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "GrantApplicationEJBDAO.SelectGrantApplicationDetail", param);
    }
    public HashMap updateGrantApplication(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "GrantApplicationEJBDAO.UpdateGrantApplication", param);
    }
    public HashMap deleteGrantApplication(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "GrantApplicationEJBDAO.DeleteGrantApplication", param);
    }
}