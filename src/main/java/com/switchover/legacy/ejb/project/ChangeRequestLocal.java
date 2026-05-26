package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ChangeRequestLocal extends EJBLocalObject {
    HashMap insertChangeRequest(DefaultParameters param) throws DefaultEJBException;
    Collection selectChangeRequestList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectChangeRequestDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateChangeRequest(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteChangeRequest(DefaultParameters param) throws DefaultEJBException;
}