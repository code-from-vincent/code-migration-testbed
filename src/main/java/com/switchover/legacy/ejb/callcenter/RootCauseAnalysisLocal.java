package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface RootCauseAnalysisLocal extends EJBLocalObject {
    HashMap insertRootCauseAnalysis(DefaultParameters param) throws DefaultEJBException;
    Collection selectRootCauseAnalysisList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectRootCauseAnalysisDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateRootCauseAnalysis(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteRootCauseAnalysis(DefaultParameters param) throws DefaultEJBException;
}