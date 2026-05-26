package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface FeatureFlagLocal extends EJBLocalObject {
    HashMap insertFeatureFlag(DefaultParameters param) throws DefaultEJBException;
    Collection selectFeatureFlagList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectFeatureFlagDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateFeatureFlag(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteFeatureFlag(DefaultParameters param) throws DefaultEJBException;
}