package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ApplicantLocal extends EJBLocalObject {
    HashMap insertApplicant(DefaultParameters param) throws DefaultEJBException;
    Collection selectApplicantList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectApplicantDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateApplicant(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteApplicant(DefaultParameters param) throws DefaultEJBException;
}