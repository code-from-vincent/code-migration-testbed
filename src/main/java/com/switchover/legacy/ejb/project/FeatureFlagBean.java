package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class FeatureFlagBean extends DefaultSession {
    private final FeatureFlagEJBDAO featureFlagEJBDAO = new FeatureFlagEJBDAO();
    public HashMap insertFeatureFlag(DefaultParameters param) throws DefaultEJBException {
        return featureFlagEJBDAO.insertFeatureFlag(param);
    }
    public Collection selectFeatureFlagList(DefaultParameters param) throws DefaultEJBException {
        return featureFlagEJBDAO.selectFeatureFlagList(param);
    }
    public HashMap selectFeatureFlagDetail(DefaultParameters param) throws DefaultEJBException {
        return featureFlagEJBDAO.selectFeatureFlagDetail(param);
    }
    public HashMap updateFeatureFlag(DefaultParameters param) throws DefaultEJBException {
        return featureFlagEJBDAO.updateFeatureFlag(param);
    }
    public HashMap deleteFeatureFlag(DefaultParameters param) throws DefaultEJBException {
        return featureFlagEJBDAO.deleteFeatureFlag(param);
    }
}