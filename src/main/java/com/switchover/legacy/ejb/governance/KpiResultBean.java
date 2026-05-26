package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class KpiResultBean extends DefaultSession {
    private final KpiResultEJBDAO kpiResultEJBDAO = new KpiResultEJBDAO();
    public HashMap insertKpiResult(DefaultParameters param) throws DefaultEJBException {
        return kpiResultEJBDAO.insertKpiResult(param);
    }
    public Collection selectKpiResultList(DefaultParameters param) throws DefaultEJBException {
        return kpiResultEJBDAO.selectKpiResultList(param);
    }
    public HashMap selectKpiResultDetail(DefaultParameters param) throws DefaultEJBException {
        return kpiResultEJBDAO.selectKpiResultDetail(param);
    }
    public HashMap updateKpiResult(DefaultParameters param) throws DefaultEJBException {
        return kpiResultEJBDAO.updateKpiResult(param);
    }
    public HashMap deleteKpiResult(DefaultParameters param) throws DefaultEJBException {
        return kpiResultEJBDAO.deleteKpiResult(param);
    }
}