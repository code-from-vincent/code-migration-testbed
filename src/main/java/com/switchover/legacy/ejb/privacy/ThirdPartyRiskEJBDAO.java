package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ThirdPartyRiskEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/privacy/180_thirdpartyrisk/ThirdPartyRisk_SQL.xml";
    public HashMap insertThirdPartyRisk(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ThirdPartyRiskEJBDAO.InsertThirdPartyRisk", param);
    }
    public Collection selectThirdPartyRiskList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ThirdPartyRiskEJBDAO.SelectThirdPartyRiskList", param);
    }
    public HashMap selectThirdPartyRiskDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ThirdPartyRiskEJBDAO.SelectThirdPartyRiskDetail", param);
    }
    public HashMap updateThirdPartyRisk(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ThirdPartyRiskEJBDAO.UpdateThirdPartyRisk", param);
    }
    public HashMap deleteThirdPartyRisk(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ThirdPartyRiskEJBDAO.DeleteThirdPartyRisk", param);
    }
}