package com.switchover.legacy.ejb.hr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface RecruitmentPostingLocalHome extends EJBLocalHome {
    RecruitmentPostingLocal create() throws CreateException;
}