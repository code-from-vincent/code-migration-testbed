package com.switchover.legacy.ejb.infra;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ApiClientLocalHome extends EJBLocalHome {
    ApiClientLocal create() throws CreateException;
}