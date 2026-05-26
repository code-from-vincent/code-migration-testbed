package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class DataImportJobEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/report/081_dataimportjob/DataImportJob_SQL.xml";
    public HashMap insertDataImportJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataImportJobEJBDAO.InsertDataImportJob", param);
    }
    public Collection selectDataImportJobList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "DataImportJobEJBDAO.SelectDataImportJobList", param);
    }
    public HashMap selectDataImportJobDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataImportJobEJBDAO.SelectDataImportJobDetail", param);
    }
    public HashMap updateDataImportJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataImportJobEJBDAO.UpdateDataImportJob", param);
    }
    public HashMap deleteDataImportJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataImportJobEJBDAO.DeleteDataImportJob", param);
    }
}