package com.switchover.legacy.ejb.rd;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ClinicalTrialLocal extends EJBLocalObject {
    HashMap insertClinicalTrial(DefaultParameters param) throws DefaultEJBException;
    Collection selectClinicalTrialList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectClinicalTrialDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateClinicalTrial(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteClinicalTrial(DefaultParameters param) throws DefaultEJBException;
}