package com.switchover.legacy.ejb.esg;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CarbonEmissionLocal extends EJBLocalObject {
    HashMap insertCarbonEmission(DefaultParameters param) throws DefaultEJBException;
    Collection selectCarbonEmissionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCarbonEmissionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCarbonEmission(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCarbonEmission(DefaultParameters param) throws DefaultEJBException;
}