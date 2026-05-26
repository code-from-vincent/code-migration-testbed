package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class MergerAcquisitionBean extends DefaultSession {
    private final MergerAcquisitionEJBDAO mergerAcquisitionEJBDAO = new MergerAcquisitionEJBDAO();
    public HashMap insertMergerAcquisition(DefaultParameters param) throws DefaultEJBException {
        return mergerAcquisitionEJBDAO.insertMergerAcquisition(param);
    }
    public Collection selectMergerAcquisitionList(DefaultParameters param) throws DefaultEJBException {
        return mergerAcquisitionEJBDAO.selectMergerAcquisitionList(param);
    }
    public HashMap selectMergerAcquisitionDetail(DefaultParameters param) throws DefaultEJBException {
        return mergerAcquisitionEJBDAO.selectMergerAcquisitionDetail(param);
    }
    public HashMap updateMergerAcquisition(DefaultParameters param) throws DefaultEJBException {
        return mergerAcquisitionEJBDAO.updateMergerAcquisition(param);
    }
    public HashMap deleteMergerAcquisition(DefaultParameters param) throws DefaultEJBException {
        return mergerAcquisitionEJBDAO.deleteMergerAcquisition(param);
    }
}