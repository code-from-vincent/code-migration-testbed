package com.switchover.legacy.ejb.callcenter;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ComplaintLocalHome extends EJBLocalHome {
    ComplaintLocal create() throws CreateException;
}