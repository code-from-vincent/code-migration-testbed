package com.switchover.legacy.ejb.itsm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ServiceLevelAgreementLocalHome extends EJBLocalHome {
    ServiceLevelAgreementLocal create() throws CreateException;
}