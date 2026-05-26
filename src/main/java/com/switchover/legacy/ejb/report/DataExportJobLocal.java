package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface DataExportJobLocal extends EJBLocalObject {
    HashMap insertDataExportJob(DefaultParameters param) throws DefaultEJBException;
    Collection selectDataExportJobList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectDataExportJobDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateDataExportJob(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteDataExportJob(DefaultParameters param) throws DefaultEJBException;
}