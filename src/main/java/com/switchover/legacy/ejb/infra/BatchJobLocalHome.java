package com.switchover.legacy.ejb.infra;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface BatchJobLocalHome extends EJBLocalHome {
    BatchJobLocal create() throws CreateException;
}