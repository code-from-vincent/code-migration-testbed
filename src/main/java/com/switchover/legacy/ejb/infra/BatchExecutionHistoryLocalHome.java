package com.switchover.legacy.ejb.infra;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface BatchExecutionHistoryLocalHome extends EJBLocalHome {
    BatchExecutionHistoryLocal create() throws CreateException;
}