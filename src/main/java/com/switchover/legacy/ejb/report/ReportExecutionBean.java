package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ReportExecutionBean extends DefaultSession {
    private final ReportExecutionEJBDAO reportExecutionEJBDAO = new ReportExecutionEJBDAO();
    public HashMap insertReportExecution(DefaultParameters param) throws DefaultEJBException {
        return reportExecutionEJBDAO.insertReportExecution(param);
    }
    public Collection selectReportExecutionList(DefaultParameters param) throws DefaultEJBException {
        return reportExecutionEJBDAO.selectReportExecutionList(param);
    }
    public HashMap selectReportExecutionDetail(DefaultParameters param) throws DefaultEJBException {
        return reportExecutionEJBDAO.selectReportExecutionDetail(param);
    }
    public HashMap updateReportExecution(DefaultParameters param) throws DefaultEJBException {
        return reportExecutionEJBDAO.updateReportExecution(param);
    }
    public HashMap deleteReportExecution(DefaultParameters param) throws DefaultEJBException {
        return reportExecutionEJBDAO.deleteReportExecution(param);
    }
}