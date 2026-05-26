package com.switchover.legacy.ejb.rd;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ExperimentRecordLocalHome extends EJBLocalHome {
    ExperimentRecordLocal create() throws CreateException;
}