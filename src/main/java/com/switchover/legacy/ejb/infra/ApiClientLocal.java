package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ApiClientLocal extends EJBLocalObject {
    HashMap insertApiClient(DefaultParameters param) throws DefaultEJBException;
    Collection selectApiClientList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectApiClientDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateApiClient(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteApiClient(DefaultParameters param) throws DefaultEJBException;
}