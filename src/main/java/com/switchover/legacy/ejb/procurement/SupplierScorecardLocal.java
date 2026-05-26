package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SupplierScorecardLocal extends EJBLocalObject {
    HashMap insertSupplierScorecard(DefaultParameters param) throws DefaultEJBException;
    Collection selectSupplierScorecardList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSupplierScorecardDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSupplierScorecard(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSupplierScorecard(DefaultParameters param) throws DefaultEJBException;
}