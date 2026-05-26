package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface KpiResultLocal extends EJBLocalObject {
    HashMap insertKpiResult(DefaultParameters param) throws DefaultEJBException;
    Collection selectKpiResultList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectKpiResultDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateKpiResult(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteKpiResult(DefaultParameters param) throws DefaultEJBException;
}