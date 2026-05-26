package com.switchover.legacy.ejb.system;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface CodeGroupLocalHome extends EJBLocalHome {
    CodeGroupLocal create() throws CreateException;
}