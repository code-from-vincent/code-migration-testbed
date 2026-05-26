package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ReportDefinitionLocal extends EJBLocalObject {
    HashMap insertReportDefinition(DefaultParameters param) throws DefaultEJBException;
    Collection selectReportDefinitionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectReportDefinitionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateReportDefinition(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteReportDefinition(DefaultParameters param) throws DefaultEJBException;
}