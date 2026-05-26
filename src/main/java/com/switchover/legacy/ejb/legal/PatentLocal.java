package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PatentLocal extends EJBLocalObject {
    HashMap insertPatent(DefaultParameters param) throws DefaultEJBException;
    Collection selectPatentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPatentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePatent(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePatent(DefaultParameters param) throws DefaultEJBException;
}