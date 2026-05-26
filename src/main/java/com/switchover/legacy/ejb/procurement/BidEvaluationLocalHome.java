package com.switchover.legacy.ejb.procurement;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface BidEvaluationLocalHome extends EJBLocalHome {
    BidEvaluationLocal create() throws CreateException;
}