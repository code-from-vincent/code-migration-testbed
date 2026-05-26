package com.switchover.legacy.ejb.system;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface CodeDetailLocalHome extends EJBLocalHome {
    CodeDetailLocal create() throws CreateException;
}