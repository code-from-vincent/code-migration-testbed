package com.switchover.legacy.ejb.infra;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ApiAccessLogLocalHome extends EJBLocalHome {
    ApiAccessLogLocal create() throws CreateException;
}