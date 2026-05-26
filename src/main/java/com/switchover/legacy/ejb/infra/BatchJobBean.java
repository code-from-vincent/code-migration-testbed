package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class BatchJobBean extends DefaultSession {
    private final BatchJobEJBDAO batchJobEJBDAO = new BatchJobEJBDAO();
    public HashMap insertBatchJob(DefaultParameters param) throws DefaultEJBException {
        return batchJobEJBDAO.insertBatchJob(param);
    }
    public Collection selectBatchJobList(DefaultParameters param) throws DefaultEJBException {
        return batchJobEJBDAO.selectBatchJobList(param);
    }
    public HashMap selectBatchJobDetail(DefaultParameters param) throws DefaultEJBException {
        return batchJobEJBDAO.selectBatchJobDetail(param);
    }
    public HashMap updateBatchJob(DefaultParameters param) throws DefaultEJBException {
        return batchJobEJBDAO.updateBatchJob(param);
    }
    public HashMap deleteBatchJob(DefaultParameters param) throws DefaultEJBException {
        return batchJobEJBDAO.deleteBatchJob(param);
    }
}