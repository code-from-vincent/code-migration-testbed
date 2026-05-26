package com.switchover.legacy.ejb.document;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SurveyLocalHome extends EJBLocalHome {
    SurveyLocal create() throws CreateException;
}