package com.switchover.legacy.ejb.callcenter;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface RootCauseAnalysisLocalHome extends EJBLocalHome {
    RootCauseAnalysisLocal create() throws CreateException;
}