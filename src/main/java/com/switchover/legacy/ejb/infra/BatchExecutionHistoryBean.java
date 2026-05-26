package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class BatchExecutionHistoryBean extends DefaultSession {
    private final BatchExecutionHistoryEJBDAO batchExecutionHistoryEJBDAO = new BatchExecutionHistoryEJBDAO();
    public HashMap insertBatchExecutionHistory(DefaultParameters param) throws DefaultEJBException {
        return batchExecutionHistoryEJBDAO.insertBatchExecutionHistory(param);
    }
    public Collection selectBatchExecutionHistoryList(DefaultParameters param) throws DefaultEJBException {
        return batchExecutionHistoryEJBDAO.selectBatchExecutionHistoryList(param);
    }
    public HashMap selectBatchExecutionHistoryDetail(DefaultParameters param) throws DefaultEJBException {
        return batchExecutionHistoryEJBDAO.selectBatchExecutionHistoryDetail(param);
    }
    public HashMap updateBatchExecutionHistory(DefaultParameters param) throws DefaultEJBException {
        return batchExecutionHistoryEJBDAO.updateBatchExecutionHistory(param);
    }
    public HashMap deleteBatchExecutionHistory(DefaultParameters param) throws DefaultEJBException {
        return batchExecutionHistoryEJBDAO.deleteBatchExecutionHistory(param);
    }
}