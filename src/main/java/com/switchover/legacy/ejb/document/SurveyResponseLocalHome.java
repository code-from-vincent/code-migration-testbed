package com.switchover.legacy.ejb.document;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SurveyResponseLocalHome extends EJBLocalHome {
    SurveyResponseLocal create() throws CreateException;
}