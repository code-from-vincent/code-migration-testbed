package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface BatchJobLocal extends EJBLocalObject {
    HashMap insertBatchJob(DefaultParameters param) throws DefaultEJBException;
    Collection selectBatchJobList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectBatchJobDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateBatchJob(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteBatchJob(DefaultParameters param) throws DefaultEJBException;
}