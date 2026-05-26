package com.switchover.legacy.ejb.csr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface GrantApplicationLocal extends EJBLocalObject {
    HashMap insertGrantApplication(DefaultParameters param) throws DefaultEJBException;
    Collection selectGrantApplicationList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectGrantApplicationDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateGrantApplication(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteGrantApplication(DefaultParameters param) throws DefaultEJBException;
}