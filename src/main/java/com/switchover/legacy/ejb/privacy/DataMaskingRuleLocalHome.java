package com.switchover.legacy.ejb.privacy;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface DataMaskingRuleLocalHome extends EJBLocalHome {
    DataMaskingRuleLocal create() throws CreateException;
}