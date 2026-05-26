package com.switchover.legacy.ejb.product;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface QualityInspectionLocalHome extends EJBLocalHome {
    QualityInspectionLocal create() throws CreateException;
}