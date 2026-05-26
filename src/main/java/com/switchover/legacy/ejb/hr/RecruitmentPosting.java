package com.switchover.legacy.ejb.hr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface RecruitmentPosting extends EJBObject {
    HashMap insertRecruitmentPosting(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRecruitmentPostingList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRecruitmentPostingDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRecruitmentPosting(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRecruitmentPosting(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
