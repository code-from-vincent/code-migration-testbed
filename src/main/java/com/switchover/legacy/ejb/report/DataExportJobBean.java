package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class DataExportJobBean extends DefaultSession {
    private final DataExportJobEJBDAO dataExportJobEJBDAO = new DataExportJobEJBDAO();
    public HashMap insertDataExportJob(DefaultParameters param) throws DefaultEJBException {
        return dataExportJobEJBDAO.insertDataExportJob(param);
    }
    public Collection selectDataExportJobList(DefaultParameters param) throws DefaultEJBException {
        return dataExportJobEJBDAO.selectDataExportJobList(param);
    }
    public HashMap selectDataExportJobDetail(DefaultParameters param) throws DefaultEJBException {
        return dataExportJobEJBDAO.selectDataExportJobDetail(param);
    }
    public HashMap updateDataExportJob(DefaultParameters param) throws DefaultEJBException {
        return dataExportJobEJBDAO.updateDataExportJob(param);
    }
    public HashMap deleteDataExportJob(DefaultParameters param) throws DefaultEJBException {
        return dataExportJobEJBDAO.deleteDataExportJob(param);
    }
}