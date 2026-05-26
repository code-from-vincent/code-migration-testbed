package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CodeDetailLocal extends EJBLocalObject {
    HashMap insertCodeDetail(DefaultParameters param) throws DefaultEJBException;
    Collection selectCodeDetailList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCodeDetailDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCodeDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCodeDetail(DefaultParameters param) throws DefaultEJBException;
}