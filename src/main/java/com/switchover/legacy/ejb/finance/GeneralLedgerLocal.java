package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface GeneralLedgerLocal extends EJBLocalObject {
    HashMap insertGeneralLedger(DefaultParameters param) throws DefaultEJBException;
    Collection selectGeneralLedgerList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectGeneralLedgerDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateGeneralLedger(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteGeneralLedger(DefaultParameters param) throws DefaultEJBException;
}