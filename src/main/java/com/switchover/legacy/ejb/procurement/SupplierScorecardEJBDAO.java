package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SupplierScorecardEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/procurement/192_supplierscorecard/SupplierScorecard_SQL.xml";
    public HashMap insertSupplierScorecard(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SupplierScorecardEJBDAO.InsertSupplierScorecard", param);
    }
    public Collection selectSupplierScorecardList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SupplierScorecardEJBDAO.SelectSupplierScorecardList", param);
    }
    public HashMap selectSupplierScorecardDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SupplierScorecardEJBDAO.SelectSupplierScorecardDetail", param);
    }
    public HashMap updateSupplierScorecard(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SupplierScorecardEJBDAO.UpdateSupplierScorecard", param);
    }
    public HashMap deleteSupplierScorecard(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SupplierScorecardEJBDAO.DeleteSupplierScorecard", param);
    }
}