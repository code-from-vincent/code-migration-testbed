package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface BatchExecutionHistoryLocal extends EJBLocalObject {
    HashMap insertBatchExecutionHistory(DefaultParameters param) throws DefaultEJBException;
    Collection selectBatchExecutionHistoryList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectBatchExecutionHistoryDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateBatchExecutionHistory(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteBatchExecutionHistory(DefaultParameters param) throws DefaultEJBException;
}