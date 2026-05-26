package com.switchover.legacy.ejb.procurement;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ContractLocalHome extends EJBLocalHome {
    ContractLocal create() throws CreateException;
}