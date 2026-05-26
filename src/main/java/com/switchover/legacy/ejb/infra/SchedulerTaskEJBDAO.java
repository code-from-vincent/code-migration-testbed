package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SchedulerTaskEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/infra/084_schedulertask/SchedulerTask_SQL.xml";
    public HashMap insertSchedulerTask(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SchedulerTaskEJBDAO.InsertSchedulerTask", param);
    }
    public Collection selectSchedulerTaskList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SchedulerTaskEJBDAO.SelectSchedulerTaskList", param);
    }
    public HashMap selectSchedulerTaskDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SchedulerTaskEJBDAO.SelectSchedulerTaskDetail", param);
    }
    public HashMap updateSchedulerTask(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SchedulerTaskEJBDAO.UpdateSchedulerTask", param);
    }
    public HashMap deleteSchedulerTask(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SchedulerTaskEJBDAO.DeleteSchedulerTask", param);
    }
}