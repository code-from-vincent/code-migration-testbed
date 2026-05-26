package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface DocumentApprovalLocal extends EJBLocalObject {
    HashMap insertDocumentApproval(DefaultParameters param) throws DefaultEJBException;
    Collection selectDocumentApprovalList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectDocumentApprovalDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateDocumentApproval(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteDocumentApproval(DefaultParameters param) throws DefaultEJBException;
}