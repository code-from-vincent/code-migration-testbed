package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class YearEndClosingBean extends DefaultSession {
    private final YearEndClosingEJBDAO yearEndClosingEJBDAO = new YearEndClosingEJBDAO();
    public HashMap insertYearEndClosing(DefaultParameters param) throws DefaultEJBException {
        return yearEndClosingEJBDAO.insertYearEndClosing(param);
    }
    public Collection selectYearEndClosingList(DefaultParameters param) throws DefaultEJBException {
        return yearEndClosingEJBDAO.selectYearEndClosingList(param);
    }
    public HashMap selectYearEndClosingDetail(DefaultParameters param) throws DefaultEJBException {
        return yearEndClosingEJBDAO.selectYearEndClosingDetail(param);
    }
    public HashMap updateYearEndClosing(DefaultParameters param) throws DefaultEJBException {
        return yearEndClosingEJBDAO.updateYearEndClosing(param);
    }
    public HashMap deleteYearEndClosing(DefaultParameters param) throws DefaultEJBException {
        return yearEndClosingEJBDAO.deleteYearEndClosing(param);
    }
}