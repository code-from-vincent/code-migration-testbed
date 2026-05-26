package com.switchover.legacy.ejb.itsm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ProblemRecordLocalHome extends EJBLocalHome {
    ProblemRecordLocal create() throws CreateException;
}