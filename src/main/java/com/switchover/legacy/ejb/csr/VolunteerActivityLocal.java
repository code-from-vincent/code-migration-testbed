package com.switchover.legacy.ejb.csr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface VolunteerActivityLocal extends EJBLocalObject {
    HashMap insertVolunteerActivity(DefaultParameters param) throws DefaultEJBException;
    Collection selectVolunteerActivityList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectVolunteerActivityDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateVolunteerActivity(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteVolunteerActivity(DefaultParameters param) throws DefaultEJBException;
}