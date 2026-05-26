package com.switchover.legacy.ejb.rd;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ResearchProjectLocalHome extends EJBLocalHome {
    ResearchProjectLocal create() throws CreateException;
}