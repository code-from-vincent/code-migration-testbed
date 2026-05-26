package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ReportDefinitionBean extends DefaultSession {
    private final ReportDefinitionEJBDAO reportDefinitionEJBDAO = new ReportDefinitionEJBDAO();
    public HashMap insertReportDefinition(DefaultParameters param) throws DefaultEJBException {
        return reportDefinitionEJBDAO.insertReportDefinition(param);
    }
    public Collection selectReportDefinitionList(DefaultParameters param) throws DefaultEJBException {
        return reportDefinitionEJBDAO.selectReportDefinitionList(param);
    }
    public HashMap selectReportDefinitionDetail(DefaultParameters param) throws DefaultEJBException {
        return reportDefinitionEJBDAO.selectReportDefinitionDetail(param);
    }
    public HashMap updateReportDefinition(DefaultParameters param) throws DefaultEJBException {
        return reportDefinitionEJBDAO.updateReportDefinition(param);
    }
    public HashMap deleteReportDefinition(DefaultParameters param) throws DefaultEJBException {
        return reportDefinitionEJBDAO.deleteReportDefinition(param);
    }
}