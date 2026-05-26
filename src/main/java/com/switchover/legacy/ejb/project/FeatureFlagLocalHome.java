package com.switchover.legacy.ejb.project;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface FeatureFlagLocalHome extends EJBLocalHome {
    FeatureFlagLocal create() throws CreateException;
}