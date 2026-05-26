package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface RecruitmentPostingLocal extends EJBLocalObject {
    HashMap insertRecruitmentPosting(DefaultParameters param) throws DefaultEJBException;
    Collection selectRecruitmentPostingList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectRecruitmentPostingDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateRecruitmentPosting(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteRecruitmentPosting(DefaultParameters param) throws DefaultEJBException;
}