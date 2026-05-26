package com.switchover.legacy.ejb.esg;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CarbonEmissionBean extends DefaultSession {
    private final CarbonEmissionEJBDAO carbonEmissionEJBDAO = new CarbonEmissionEJBDAO();
    public HashMap insertCarbonEmission(DefaultParameters param) throws DefaultEJBException {
        return carbonEmissionEJBDAO.insertCarbonEmission(param);
    }
    public Collection selectCarbonEmissionList(DefaultParameters param) throws DefaultEJBException {
        return carbonEmissionEJBDAO.selectCarbonEmissionList(param);
    }
    public HashMap selectCarbonEmissionDetail(DefaultParameters param) throws DefaultEJBException {
        return carbonEmissionEJBDAO.selectCarbonEmissionDetail(param);
    }
    public HashMap updateCarbonEmission(DefaultParameters param) throws DefaultEJBException {
        return carbonEmissionEJBDAO.updateCarbonEmission(param);
    }
    public HashMap deleteCarbonEmission(DefaultParameters param) throws DefaultEJBException {
        return carbonEmissionEJBDAO.deleteCarbonEmission(param);
    }
}