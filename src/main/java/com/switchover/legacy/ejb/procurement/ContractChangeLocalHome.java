package com.switchover.legacy.ejb.procurement;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ContractChangeLocalHome extends EJBLocalHome {
    ContractChangeLocal create() throws CreateException;
}