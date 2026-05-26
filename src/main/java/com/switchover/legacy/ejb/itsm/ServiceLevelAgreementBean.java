package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ServiceLevelAgreementBean extends DefaultSession {
    private final ServiceLevelAgreementEJBDAO serviceLevelAgreementEJBDAO = new ServiceLevelAgreementEJBDAO();
    public HashMap insertServiceLevelAgreement(DefaultParameters param) throws DefaultEJBException {
        return serviceLevelAgreementEJBDAO.insertServiceLevelAgreement(param);
    }
    public Collection selectServiceLevelAgreementList(DefaultParameters param) throws DefaultEJBException {
        return serviceLevelAgreementEJBDAO.selectServiceLevelAgreementList(param);
    }
    public HashMap selectServiceLevelAgreementDetail(DefaultParameters param) throws DefaultEJBException {
        return serviceLevelAgreementEJBDAO.selectServiceLevelAgreementDetail(param);
    }
    public HashMap updateServiceLevelAgreement(DefaultParameters param) throws DefaultEJBException {
        return serviceLevelAgreementEJBDAO.updateServiceLevelAgreement(param);
    }
    public HashMap deleteServiceLevelAgreement(DefaultParameters param) throws DefaultEJBException {
        return serviceLevelAgreementEJBDAO.deleteServiceLevelAgreement(param);
    }
}