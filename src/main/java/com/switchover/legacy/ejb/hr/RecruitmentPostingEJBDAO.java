package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class RecruitmentPostingEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/hr/031_recruitmentposting/RecruitmentPosting_SQL.xml";
    public HashMap insertRecruitmentPosting(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RecruitmentPostingEJBDAO.InsertRecruitmentPosting", param);
    }
    public Collection selectRecruitmentPostingList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "RecruitmentPostingEJBDAO.SelectRecruitmentPostingList", param);
    }
    public HashMap selectRecruitmentPostingDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RecruitmentPostingEJBDAO.SelectRecruitmentPostingDetail", param);
    }
    public HashMap updateRecruitmentPosting(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RecruitmentPostingEJBDAO.UpdateRecruitmentPosting", param);
    }
    public HashMap deleteRecruitmentPosting(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RecruitmentPostingEJBDAO.DeleteRecruitmentPosting", param);
    }
}