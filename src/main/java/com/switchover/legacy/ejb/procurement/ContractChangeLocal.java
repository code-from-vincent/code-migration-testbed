package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ContractChangeLocal extends EJBLocalObject {
    HashMap insertContractChange(DefaultParameters param) throws DefaultEJBException;
    Collection selectContractChangeList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectContractChangeDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateContractChange(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteContractChange(DefaultParameters param) throws DefaultEJBException;
}