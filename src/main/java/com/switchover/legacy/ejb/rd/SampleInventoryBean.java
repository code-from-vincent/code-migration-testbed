package com.switchover.legacy.ejb.rd;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SampleInventoryBean extends DefaultSession {
    private final SampleInventoryEJBDAO sampleInventoryEJBDAO = new SampleInventoryEJBDAO();
    public HashMap insertSampleInventory(DefaultParameters param) throws DefaultEJBException {
        return sampleInventoryEJBDAO.insertSampleInventory(param);
    }
    public Collection selectSampleInventoryList(DefaultParameters param) throws DefaultEJBException {
        return sampleInventoryEJBDAO.selectSampleInventoryList(param);
    }
    public HashMap selectSampleInventoryDetail(DefaultParameters param) throws DefaultEJBException {
        return sampleInventoryEJBDAO.selectSampleInventoryDetail(param);
    }
    public HashMap updateSampleInventory(DefaultParameters param) throws DefaultEJBException {
        return sampleInventoryEJBDAO.updateSampleInventory(param);
    }
    public HashMap deleteSampleInventory(DefaultParameters param) throws DefaultEJBException {
        return sampleInventoryEJBDAO.deleteSampleInventory(param);
    }
}