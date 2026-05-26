package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface OpportunityLocal extends EJBLocalObject {
    HashMap insertOpportunity(DefaultParameters param) throws DefaultEJBException;
    Collection selectOpportunityList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectOpportunityDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateOpportunity(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteOpportunity(DefaultParameters param) throws DefaultEJBException;
}