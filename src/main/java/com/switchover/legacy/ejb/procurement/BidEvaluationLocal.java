package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface BidEvaluationLocal extends EJBLocalObject {
    HashMap insertBidEvaluation(DefaultParameters param) throws DefaultEJBException;
    Collection selectBidEvaluationList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectBidEvaluationDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateBidEvaluation(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteBidEvaluation(DefaultParameters param) throws DefaultEJBException;
}