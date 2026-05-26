package com.switchover.legacy.ejb.infra;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface BackupJobLocalHome extends EJBLocalHome {
    BackupJobLocal create() throws CreateException;
}