package com.switchover.legacy.ejb.esg;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CarbonEmissionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/esg/194_carbonemission/CarbonEmission_SQL.xml";
    public HashMap insertCarbonEmission(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CarbonEmissionEJBDAO.InsertCarbonEmission", param);
    }
    public Collection selectCarbonEmissionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CarbonEmissionEJBDAO.SelectCarbonEmissionList", param);
    }
    public HashMap selectCarbonEmissionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CarbonEmissionEJBDAO.SelectCarbonEmissionDetail", param);
    }
    public HashMap updateCarbonEmission(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CarbonEmissionEJBDAO.UpdateCarbonEmission", param);
    }
    public HashMap deleteCarbonEmission(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CarbonEmissionEJBDAO.DeleteCarbonEmission", param);
    }
}