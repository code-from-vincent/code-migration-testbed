package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface FranchiseContractLocal extends EJBLocalObject {
    HashMap insertFranchiseContract(DefaultParameters param) throws DefaultEJBException;
    Collection selectFranchiseContractList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectFranchiseContractDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateFranchiseContract(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteFranchiseContract(DefaultParameters param) throws DefaultEJBException;
}