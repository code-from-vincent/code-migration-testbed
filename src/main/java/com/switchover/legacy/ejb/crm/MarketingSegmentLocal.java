package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface MarketingSegmentLocal extends EJBLocalObject {
    HashMap insertMarketingSegment(DefaultParameters param) throws DefaultEJBException;
    Collection selectMarketingSegmentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectMarketingSegmentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateMarketingSegment(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteMarketingSegment(DefaultParameters param) throws DefaultEJBException;
}