package com.switchover.legacy.ejb.manufacturing;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ManufacturingStepLocalHome extends EJBLocalHome {
    ManufacturingStepLocal create() throws CreateException;
}