package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class QualityInspectionBean extends DefaultSession {
    private final QualityInspectionEJBDAO qualityInspectionEJBDAO = new QualityInspectionEJBDAO();
    public HashMap insertQualityInspection(DefaultParameters param) throws DefaultEJBException {
        return qualityInspectionEJBDAO.insertQualityInspection(param);
    }
    public Collection selectQualityInspectionList(DefaultParameters param) throws DefaultEJBException {
        return qualityInspectionEJBDAO.selectQualityInspectionList(param);
    }
    public HashMap selectQualityInspectionDetail(DefaultParameters param) throws DefaultEJBException {
        return qualityInspectionEJBDAO.selectQualityInspectionDetail(param);
    }
    public HashMap updateQualityInspection(DefaultParameters param) throws DefaultEJBException {
        return qualityInspectionEJBDAO.updateQualityInspection(param);
    }
    public HashMap deleteQualityInspection(DefaultParameters param) throws DefaultEJBException {
        return qualityInspectionEJBDAO.deleteQualityInspection(param);
    }
}