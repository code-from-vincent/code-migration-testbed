package com.switchover.legacy.ejb.privacy;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ThirdPartyRiskLocalHome extends EJBLocalHome {
    ThirdPartyRiskLocal create() throws CreateException;
}