package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class DataExportJobEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/report/080_dataexportjob/DataExportJob_SQL.xml";
    public HashMap insertDataExportJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataExportJobEJBDAO.InsertDataExportJob", param);
    }
    public Collection selectDataExportJobList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "DataExportJobEJBDAO.SelectDataExportJobList", param);
    }
    public HashMap selectDataExportJobDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataExportJobEJBDAO.SelectDataExportJobDetail", param);
    }
    public HashMap updateDataExportJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataExportJobEJBDAO.UpdateDataExportJob", param);
    }
    public HashMap deleteDataExportJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataExportJobEJBDAO.DeleteDataExportJob", param);
    }
}