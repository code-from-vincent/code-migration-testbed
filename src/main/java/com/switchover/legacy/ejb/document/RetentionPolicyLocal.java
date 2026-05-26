package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface RetentionPolicyLocal extends EJBLocalObject {
    HashMap insertRetentionPolicy(DefaultParameters param) throws DefaultEJBException;
    Collection selectRetentionPolicyList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectRetentionPolicyDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateRetentionPolicy(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteRetentionPolicy(DefaultParameters param) throws DefaultEJBException;
}