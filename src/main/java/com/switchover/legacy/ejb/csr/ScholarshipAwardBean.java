package com.switchover.legacy.ejb.csr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ScholarshipAwardBean extends DefaultSession {
    private final ScholarshipAwardEJBDAO scholarshipAwardEJBDAO = new ScholarshipAwardEJBDAO();
    public HashMap insertScholarshipAward(DefaultParameters param) throws DefaultEJBException {
        return scholarshipAwardEJBDAO.insertScholarshipAward(param);
    }
    public Collection selectScholarshipAwardList(DefaultParameters param) throws DefaultEJBException {
        return scholarshipAwardEJBDAO.selectScholarshipAwardList(param);
    }
    public HashMap selectScholarshipAwardDetail(DefaultParameters param) throws DefaultEJBException {
        return scholarshipAwardEJBDAO.selectScholarshipAwardDetail(param);
    }
    public HashMap updateScholarshipAward(DefaultParameters param) throws DefaultEJBException {
        return scholarshipAwardEJBDAO.updateScholarshipAward(param);
    }
    public HashMap deleteScholarshipAward(DefaultParameters param) throws DefaultEJBException {
        return scholarshipAwardEJBDAO.deleteScholarshipAward(param);
    }
}