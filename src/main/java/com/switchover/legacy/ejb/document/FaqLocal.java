package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface FaqLocal extends EJBLocalObject {
    HashMap insertFaq(DefaultParameters param) throws DefaultEJBException;
    Collection selectFaqList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectFaqDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateFaq(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteFaq(DefaultParameters param) throws DefaultEJBException;
}