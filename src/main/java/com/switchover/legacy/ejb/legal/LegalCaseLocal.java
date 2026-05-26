package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface LegalCaseLocal extends EJBLocalObject {
    HashMap insertLegalCase(DefaultParameters param) throws DefaultEJBException;
    Collection selectLegalCaseList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectLegalCaseDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateLegalCase(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteLegalCase(DefaultParameters param) throws DefaultEJBException;
}