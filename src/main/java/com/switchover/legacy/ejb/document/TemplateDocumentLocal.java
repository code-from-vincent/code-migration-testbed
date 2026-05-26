package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface TemplateDocumentLocal extends EJBLocalObject {
    HashMap insertTemplateDocument(DefaultParameters param) throws DefaultEJBException;
    Collection selectTemplateDocumentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectTemplateDocumentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateTemplateDocument(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteTemplateDocument(DefaultParameters param) throws DefaultEJBException;
}