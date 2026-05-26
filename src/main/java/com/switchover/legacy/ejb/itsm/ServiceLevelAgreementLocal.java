package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ServiceLevelAgreementLocal extends EJBLocalObject {
    HashMap insertServiceLevelAgreement(DefaultParameters param) throws DefaultEJBException;
    Collection selectServiceLevelAgreementList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectServiceLevelAgreementDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateServiceLevelAgreement(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteServiceLevelAgreement(DefaultParameters param) throws DefaultEJBException;
}