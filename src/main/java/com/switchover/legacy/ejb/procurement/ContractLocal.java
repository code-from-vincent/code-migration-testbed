package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ContractLocal extends EJBLocalObject {
    HashMap insertContract(DefaultParameters param) throws DefaultEJBException;
    Collection selectContractList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectContractDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateContract(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteContract(DefaultParameters param) throws DefaultEJBException;
}