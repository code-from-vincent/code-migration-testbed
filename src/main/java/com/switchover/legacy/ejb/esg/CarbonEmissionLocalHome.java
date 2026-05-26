package com.switchover.legacy.ejb.esg;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface CarbonEmissionLocalHome extends EJBLocalHome {
    CarbonEmissionLocal create() throws CreateException;
}