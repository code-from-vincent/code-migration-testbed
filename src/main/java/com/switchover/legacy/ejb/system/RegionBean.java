package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class RegionBean extends DefaultSession {
    private final RegionEJBDAO regionEJBDAO = new RegionEJBDAO();
    public HashMap insertRegion(DefaultParameters param) throws DefaultEJBException {
        return regionEJBDAO.insertRegion(param);
    }
    public Collection selectRegionList(DefaultParameters param) throws DefaultEJBException {
        return regionEJBDAO.selectRegionList(param);
    }
    public HashMap selectRegionDetail(DefaultParameters param) throws DefaultEJBException {
        return regionEJBDAO.selectRegionDetail(param);
    }
    public HashMap updateRegion(DefaultParameters param) throws DefaultEJBException {
        return regionEJBDAO.updateRegion(param);
    }
    public HashMap deleteRegion(DefaultParameters param) throws DefaultEJBException {
        return regionEJBDAO.deleteRegion(param);
    }
}