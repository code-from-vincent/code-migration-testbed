package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface DocumentLocal extends EJBLocalObject {
    HashMap insertDocument(DefaultParameters param) throws DefaultEJBException;
    Collection selectDocumentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectDocumentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateDocument(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteDocument(DefaultParameters param) throws DefaultEJBException;
}