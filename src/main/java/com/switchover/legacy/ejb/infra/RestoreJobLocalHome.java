package com.switchover.legacy.ejb.infra;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface RestoreJobLocalHome extends EJBLocalHome {
    RestoreJobLocal create() throws CreateException;
}