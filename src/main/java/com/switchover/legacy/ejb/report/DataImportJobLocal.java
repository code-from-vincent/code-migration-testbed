package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface DataImportJobLocal extends EJBLocalObject {
    HashMap insertDataImportJob(DefaultParameters param) throws DefaultEJBException;
    Collection selectDataImportJobList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectDataImportJobDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateDataImportJob(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteDataImportJob(DefaultParameters param) throws DefaultEJBException;
}