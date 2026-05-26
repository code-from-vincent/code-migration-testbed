package com.switchover.legacy.ejb.csr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ScholarshipAwardLocal extends EJBLocalObject {
    HashMap insertScholarshipAward(DefaultParameters param) throws DefaultEJBException;
    Collection selectScholarshipAwardList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectScholarshipAwardDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateScholarshipAward(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteScholarshipAward(DefaultParameters param) throws DefaultEJBException;
}