package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface KpiDefinitionLocal extends EJBLocalObject {
    HashMap insertKpiDefinition(DefaultParameters param) throws DefaultEJBException;
    Collection selectKpiDefinitionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectKpiDefinitionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateKpiDefinition(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteKpiDefinition(DefaultParameters param) throws DefaultEJBException;
}