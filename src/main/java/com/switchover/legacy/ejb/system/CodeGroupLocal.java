package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CodeGroupLocal extends EJBLocalObject {
    HashMap insertCodeGroup(DefaultParameters param) throws DefaultEJBException;
    Collection selectCodeGroupList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCodeGroupDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCodeGroup(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCodeGroup(DefaultParameters param) throws DefaultEJBException;
}