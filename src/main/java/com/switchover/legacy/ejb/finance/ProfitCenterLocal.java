package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ProfitCenterLocal extends EJBLocalObject {
    HashMap insertProfitCenter(DefaultParameters param) throws DefaultEJBException;
    Collection selectProfitCenterList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectProfitCenterDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateProfitCenter(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteProfitCenter(DefaultParameters param) throws DefaultEJBException;
}