package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ActionItemLocal extends EJBLocalObject {
    HashMap insertActionItem(DefaultParameters param) throws DefaultEJBException;
    Collection selectActionItemList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectActionItemDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateActionItem(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteActionItem(DefaultParameters param) throws DefaultEJBException;
}