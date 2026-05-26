package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface YearEndClosingLocalHome extends EJBLocalHome {
    YearEndClosingLocal create() throws CreateException;
}