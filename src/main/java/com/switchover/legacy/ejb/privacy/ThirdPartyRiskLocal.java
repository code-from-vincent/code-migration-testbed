package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ThirdPartyRiskLocal extends EJBLocalObject {
    HashMap insertThirdPartyRisk(DefaultParameters param) throws DefaultEJBException;
    Collection selectThirdPartyRiskList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectThirdPartyRiskDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateThirdPartyRisk(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteThirdPartyRisk(DefaultParameters param) throws DefaultEJBException;
}