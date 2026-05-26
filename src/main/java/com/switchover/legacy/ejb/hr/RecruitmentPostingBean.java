package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class RecruitmentPostingBean extends DefaultSession {
    private final RecruitmentPostingEJBDAO recruitmentPostingEJBDAO = new RecruitmentPostingEJBDAO();
    public HashMap insertRecruitmentPosting(DefaultParameters param) throws DefaultEJBException {
        return recruitmentPostingEJBDAO.insertRecruitmentPosting(param);
    }
    public Collection selectRecruitmentPostingList(DefaultParameters param) throws DefaultEJBException {
        return recruitmentPostingEJBDAO.selectRecruitmentPostingList(param);
    }
    public HashMap selectRecruitmentPostingDetail(DefaultParameters param) throws DefaultEJBException {
        return recruitmentPostingEJBDAO.selectRecruitmentPostingDetail(param);
    }
    public HashMap updateRecruitmentPosting(DefaultParameters param) throws DefaultEJBException {
        return recruitmentPostingEJBDAO.updateRecruitmentPosting(param);
    }
    public HashMap deleteRecruitmentPosting(DefaultParameters param) throws DefaultEJBException {
        return recruitmentPostingEJBDAO.deleteRecruitmentPosting(param);
    }
}