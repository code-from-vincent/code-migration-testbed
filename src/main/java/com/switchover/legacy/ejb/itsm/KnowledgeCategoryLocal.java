package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface KnowledgeCategoryLocal extends EJBLocalObject {
    HashMap insertKnowledgeCategory(DefaultParameters param) throws DefaultEJBException;
    Collection selectKnowledgeCategoryList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectKnowledgeCategoryDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateKnowledgeCategory(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteKnowledgeCategory(DefaultParameters param) throws DefaultEJBException;
}