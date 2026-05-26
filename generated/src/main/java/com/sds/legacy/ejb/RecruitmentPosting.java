package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface RecruitmentPosting extends DefaultSession {
    HashMap insertRecruitmentPosting(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRecruitmentPostingList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRecruitmentPostingDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRecruitmentPosting(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRecruitmentPosting(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
