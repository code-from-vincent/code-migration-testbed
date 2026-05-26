package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class DataImportJobBean extends DefaultSession {
    private final DataImportJobEJBDAO dataImportJobEJBDAO = new DataImportJobEJBDAO();
    public HashMap insertDataImportJob(DefaultParameters param) throws DefaultEJBException {
        return dataImportJobEJBDAO.insertDataImportJob(param);
    }
    public Collection selectDataImportJobList(DefaultParameters param) throws DefaultEJBException {
        return dataImportJobEJBDAO.selectDataImportJobList(param);
    }
    public HashMap selectDataImportJobDetail(DefaultParameters param) throws DefaultEJBException {
        return dataImportJobEJBDAO.selectDataImportJobDetail(param);
    }
    public HashMap updateDataImportJob(DefaultParameters param) throws DefaultEJBException {
        return dataImportJobEJBDAO.updateDataImportJob(param);
    }
    public HashMap deleteDataImportJob(DefaultParameters param) throws DefaultEJBException {
        return dataImportJobEJBDAO.deleteDataImportJob(param);
    }
}