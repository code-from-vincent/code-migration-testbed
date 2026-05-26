package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class RootCauseAnalysisEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/callcenter/144_rootcauseanalysis/RootCauseAnalysis_SQL.xml";
    public HashMap insertRootCauseAnalysis(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RootCauseAnalysisEJBDAO.InsertRootCauseAnalysis", param);
    }
    public Collection selectRootCauseAnalysisList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "RootCauseAnalysisEJBDAO.SelectRootCauseAnalysisList", param);
    }
    public HashMap selectRootCauseAnalysisDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RootCauseAnalysisEJBDAO.SelectRootCauseAnalysisDetail", param);
    }
    public HashMap updateRootCauseAnalysis(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RootCauseAnalysisEJBDAO.UpdateRootCauseAnalysis", param);
    }
    public HashMap deleteRootCauseAnalysis(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RootCauseAnalysisEJBDAO.DeleteRootCauseAnalysis", param);
    }
}