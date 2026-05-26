package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ServiceLevelAgreementEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/itsm/065_servicelevelagreement/ServiceLevelAgreement_SQL.xml";
    public HashMap insertServiceLevelAgreement(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ServiceLevelAgreementEJBDAO.InsertServiceLevelAgreement", param);
    }
    public Collection selectServiceLevelAgreementList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ServiceLevelAgreementEJBDAO.SelectServiceLevelAgreementList", param);
    }
    public HashMap selectServiceLevelAgreementDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ServiceLevelAgreementEJBDAO.SelectServiceLevelAgreementDetail", param);
    }
    public HashMap updateServiceLevelAgreement(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ServiceLevelAgreementEJBDAO.UpdateServiceLevelAgreement", param);
    }
    public HashMap deleteServiceLevelAgreement(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ServiceLevelAgreementEJBDAO.DeleteServiceLevelAgreement", param);
    }
}