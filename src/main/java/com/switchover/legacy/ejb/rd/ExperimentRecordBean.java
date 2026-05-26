package com.switchover.legacy.ejb.rd;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ExperimentRecordBean extends DefaultSession {
    private final ExperimentRecordEJBDAO experimentRecordEJBDAO = new ExperimentRecordEJBDAO();
    public HashMap insertExperimentRecord(DefaultParameters param) throws DefaultEJBException {
        return experimentRecordEJBDAO.insertExperimentRecord(param);
    }
    public Collection selectExperimentRecordList(DefaultParameters param) throws DefaultEJBException {
        return experimentRecordEJBDAO.selectExperimentRecordList(param);
    }
    public HashMap selectExperimentRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return experimentRecordEJBDAO.selectExperimentRecordDetail(param);
    }
    public HashMap updateExperimentRecord(DefaultParameters param) throws DefaultEJBException {
        return experimentRecordEJBDAO.updateExperimentRecord(param);
    }
    public HashMap deleteExperimentRecord(DefaultParameters param) throws DefaultEJBException {
        return experimentRecordEJBDAO.deleteExperimentRecord(param);
    }
}