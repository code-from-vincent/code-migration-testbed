package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ComplaintLocal extends EJBLocalObject {
    HashMap insertComplaint(DefaultParameters param) throws DefaultEJBException;
    Collection selectComplaintList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectComplaintDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateComplaint(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteComplaint(DefaultParameters param) throws DefaultEJBException;
}