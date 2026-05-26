package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ApiAccessLogLocal extends EJBLocalObject {
    HashMap insertApiAccessLog(DefaultParameters param) throws DefaultEJBException;
    Collection selectApiAccessLogList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectApiAccessLogDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateApiAccessLog(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteApiAccessLog(DefaultParameters param) throws DefaultEJBException;
}