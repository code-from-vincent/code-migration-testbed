package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class DataBreachReportBean extends DefaultSession {
    private final DataBreachReportEJBDAO dataBreachReportEJBDAO = new DataBreachReportEJBDAO();
    public HashMap insertDataBreachReport(DefaultParameters param) throws DefaultEJBException {
        return dataBreachReportEJBDAO.insertDataBreachReport(param);
    }
    public Collection selectDataBreachReportList(DefaultParameters param) throws DefaultEJBException {
        return dataBreachReportEJBDAO.selectDataBreachReportList(param);
    }
    public HashMap selectDataBreachReportDetail(DefaultParameters param) throws DefaultEJBException {
        return dataBreachReportEJBDAO.selectDataBreachReportDetail(param);
    }
    public HashMap updateDataBreachReport(DefaultParameters param) throws DefaultEJBException {
        return dataBreachReportEJBDAO.updateDataBreachReport(param);
    }
    public HashMap deleteDataBreachReport(DefaultParameters param) throws DefaultEJBException {
        return dataBreachReportEJBDAO.deleteDataBreachReport(param);
    }
}