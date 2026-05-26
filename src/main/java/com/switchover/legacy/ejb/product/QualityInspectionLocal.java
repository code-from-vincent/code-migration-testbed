package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface QualityInspectionLocal extends EJBLocalObject {
    HashMap insertQualityInspection(DefaultParameters param) throws DefaultEJBException;
    Collection selectQualityInspectionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectQualityInspectionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateQualityInspection(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteQualityInspection(DefaultParameters param) throws DefaultEJBException;
}