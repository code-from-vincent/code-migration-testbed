package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ProblemRecordBean extends DefaultSession {
    private final ProblemRecordEJBDAO problemRecordEJBDAO = new ProblemRecordEJBDAO();
    public HashMap insertProblemRecord(DefaultParameters param) throws DefaultEJBException {
        return problemRecordEJBDAO.insertProblemRecord(param);
    }
    public Collection selectProblemRecordList(DefaultParameters param) throws DefaultEJBException {
        return problemRecordEJBDAO.selectProblemRecordList(param);
    }
    public HashMap selectProblemRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return problemRecordEJBDAO.selectProblemRecordDetail(param);
    }
    public HashMap updateProblemRecord(DefaultParameters param) throws DefaultEJBException {
        return problemRecordEJBDAO.updateProblemRecord(param);
    }
    public HashMap deleteProblemRecord(DefaultParameters param) throws DefaultEJBException {
        return problemRecordEJBDAO.deleteProblemRecord(param);
    }
}