package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class BatchExecutionHistoryEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/infra/070_batchexecutionhistory/BatchExecutionHistory_SQL.xml";
    public HashMap insertBatchExecutionHistory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BatchExecutionHistoryEJBDAO.InsertBatchExecutionHistory", param);
    }
    public Collection selectBatchExecutionHistoryList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "BatchExecutionHistoryEJBDAO.SelectBatchExecutionHistoryList", param);
    }
    public HashMap selectBatchExecutionHistoryDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BatchExecutionHistoryEJBDAO.SelectBatchExecutionHistoryDetail", param);
    }
    public HashMap updateBatchExecutionHistory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BatchExecutionHistoryEJBDAO.UpdateBatchExecutionHistory", param);
    }
    public HashMap deleteBatchExecutionHistory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BatchExecutionHistoryEJBDAO.DeleteBatchExecutionHistory", param);
    }
}