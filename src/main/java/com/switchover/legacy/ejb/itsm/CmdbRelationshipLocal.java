package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CmdbRelationshipLocal extends EJBLocalObject {
    HashMap insertCmdbRelationship(DefaultParameters param) throws DefaultEJBException;
    Collection selectCmdbRelationshipList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCmdbRelationshipDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCmdbRelationship(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCmdbRelationship(DefaultParameters param) throws DefaultEJBException;
}