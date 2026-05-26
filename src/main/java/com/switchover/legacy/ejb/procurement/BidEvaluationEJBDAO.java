package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class BidEvaluationEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/procurement/122_bidevaluation/BidEvaluation_SQL.xml";
    public HashMap insertBidEvaluation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BidEvaluationEJBDAO.InsertBidEvaluation", param);
    }
    public Collection selectBidEvaluationList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "BidEvaluationEJBDAO.SelectBidEvaluationList", param);
    }
    public HashMap selectBidEvaluationDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BidEvaluationEJBDAO.SelectBidEvaluationDetail", param);
    }
    public HashMap updateBidEvaluation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BidEvaluationEJBDAO.UpdateBidEvaluation", param);
    }
    public HashMap deleteBidEvaluation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BidEvaluationEJBDAO.DeleteBidEvaluation", param);
    }
}