package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ReleasePlanLocal extends EJBLocalObject {
    HashMap insertReleasePlan(DefaultParameters param) throws DefaultEJBException;
    Collection selectReleasePlanList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectReleasePlanDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateReleasePlan(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteReleasePlan(DefaultParameters param) throws DefaultEJBException;
}