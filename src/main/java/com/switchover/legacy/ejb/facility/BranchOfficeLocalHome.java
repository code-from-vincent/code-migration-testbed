package com.switchover.legacy.ejb.facility;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface BranchOfficeLocalHome extends EJBLocalHome {
    BranchOfficeLocal create() throws CreateException;
}