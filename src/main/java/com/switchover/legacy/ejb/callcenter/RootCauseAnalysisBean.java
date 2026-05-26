package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class RootCauseAnalysisBean extends DefaultSession {
    private final RootCauseAnalysisEJBDAO rootCauseAnalysisEJBDAO = new RootCauseAnalysisEJBDAO();
    public HashMap insertRootCauseAnalysis(DefaultParameters param) throws DefaultEJBException {
        return rootCauseAnalysisEJBDAO.insertRootCauseAnalysis(param);
    }
    public Collection selectRootCauseAnalysisList(DefaultParameters param) throws DefaultEJBException {
        return rootCauseAnalysisEJBDAO.selectRootCauseAnalysisList(param);
    }
    public HashMap selectRootCauseAnalysisDetail(DefaultParameters param) throws DefaultEJBException {
        return rootCauseAnalysisEJBDAO.selectRootCauseAnalysisDetail(param);
    }
    public HashMap updateRootCauseAnalysis(DefaultParameters param) throws DefaultEJBException {
        return rootCauseAnalysisEJBDAO.updateRootCauseAnalysis(param);
    }
    public HashMap deleteRootCauseAnalysis(DefaultParameters param) throws DefaultEJBException {
        return rootCauseAnalysisEJBDAO.deleteRootCauseAnalysis(param);
    }
}