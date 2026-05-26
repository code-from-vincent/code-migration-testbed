package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PerformanceReviewEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/hr/030_performancereview/PerformanceReview_SQL.xml";
    public HashMap insertPerformanceReview(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PerformanceReviewEJBDAO.InsertPerformanceReview", param);
    }
    public Collection selectPerformanceReviewList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PerformanceReviewEJBDAO.SelectPerformanceReviewList", param);
    }
    public HashMap selectPerformanceReviewDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PerformanceReviewEJBDAO.SelectPerformanceReviewDetail", param);
    }
    public HashMap updatePerformanceReview(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PerformanceReviewEJBDAO.UpdatePerformanceReview", param);
    }
    public HashMap deletePerformanceReview(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PerformanceReviewEJBDAO.DeletePerformanceReview", param);
    }
}