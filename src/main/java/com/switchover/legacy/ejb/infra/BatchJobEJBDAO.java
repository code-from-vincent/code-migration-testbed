package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class BatchJobEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/infra/069_batchjob/BatchJob_SQL.xml";
    public HashMap insertBatchJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BatchJobEJBDAO.InsertBatchJob", param);
    }
    public Collection selectBatchJobList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "BatchJobEJBDAO.SelectBatchJobList", param);
    }
    public HashMap selectBatchJobDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BatchJobEJBDAO.SelectBatchJobDetail", param);
    }
    public HashMap updateBatchJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BatchJobEJBDAO.UpdateBatchJob", param);
    }
    public HashMap deleteBatchJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BatchJobEJBDAO.DeleteBatchJob", param);
    }
}