package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class MarketingSegmentBean extends DefaultSession {
    private final MarketingSegmentEJBDAO marketingSegmentEJBDAO = new MarketingSegmentEJBDAO();
    public HashMap insertMarketingSegment(DefaultParameters param) throws DefaultEJBException {
        return marketingSegmentEJBDAO.insertMarketingSegment(param);
    }
    public Collection selectMarketingSegmentList(DefaultParameters param) throws DefaultEJBException {
        return marketingSegmentEJBDAO.selectMarketingSegmentList(param);
    }
    public HashMap selectMarketingSegmentDetail(DefaultParameters param) throws DefaultEJBException {
        return marketingSegmentEJBDAO.selectMarketingSegmentDetail(param);
    }
    public HashMap updateMarketingSegment(DefaultParameters param) throws DefaultEJBException {
        return marketingSegmentEJBDAO.updateMarketingSegment(param);
    }
    public HashMap deleteMarketingSegment(DefaultParameters param) throws DefaultEJBException {
        return marketingSegmentEJBDAO.deleteMarketingSegment(param);
    }
}