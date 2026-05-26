package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class BidEvaluationBean extends DefaultSession {
    private final BidEvaluationEJBDAO bidEvaluationEJBDAO = new BidEvaluationEJBDAO();
    public HashMap insertBidEvaluation(DefaultParameters param) throws DefaultEJBException {
        return bidEvaluationEJBDAO.insertBidEvaluation(param);
    }
    public Collection selectBidEvaluationList(DefaultParameters param) throws DefaultEJBException {
        return bidEvaluationEJBDAO.selectBidEvaluationList(param);
    }
    public HashMap selectBidEvaluationDetail(DefaultParameters param) throws DefaultEJBException {
        return bidEvaluationEJBDAO.selectBidEvaluationDetail(param);
    }
    public HashMap updateBidEvaluation(DefaultParameters param) throws DefaultEJBException {
        return bidEvaluationEJBDAO.updateBidEvaluation(param);
    }
    public HashMap deleteBidEvaluation(DefaultParameters param) throws DefaultEJBException {
        return bidEvaluationEJBDAO.deleteBidEvaluation(param);
    }
}