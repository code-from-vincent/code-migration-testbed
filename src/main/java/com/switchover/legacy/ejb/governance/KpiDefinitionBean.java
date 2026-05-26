package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class KpiDefinitionBean extends DefaultSession {
    private final KpiDefinitionEJBDAO kpiDefinitionEJBDAO = new KpiDefinitionEJBDAO();
    public HashMap insertKpiDefinition(DefaultParameters param) throws DefaultEJBException {
        return kpiDefinitionEJBDAO.insertKpiDefinition(param);
    }
    public Collection selectKpiDefinitionList(DefaultParameters param) throws DefaultEJBException {
        return kpiDefinitionEJBDAO.selectKpiDefinitionList(param);
    }
    public HashMap selectKpiDefinitionDetail(DefaultParameters param) throws DefaultEJBException {
        return kpiDefinitionEJBDAO.selectKpiDefinitionDetail(param);
    }
    public HashMap updateKpiDefinition(DefaultParameters param) throws DefaultEJBException {
        return kpiDefinitionEJBDAO.updateKpiDefinition(param);
    }
    public HashMap deleteKpiDefinition(DefaultParameters param) throws DefaultEJBException {
        return kpiDefinitionEJBDAO.deleteKpiDefinition(param);
    }
}