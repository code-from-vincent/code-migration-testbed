package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class YearEndClosingEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/119_yearendclosing/YearEndClosing_SQL.xml";
    public HashMap insertYearEndClosing(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "YearEndClosingEJBDAO.InsertYearEndClosing", param);
    }
    public Collection selectYearEndClosingList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "YearEndClosingEJBDAO.SelectYearEndClosingList", param);
    }
    public HashMap selectYearEndClosingDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "YearEndClosingEJBDAO.SelectYearEndClosingDetail", param);
    }
    public HashMap updateYearEndClosing(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "YearEndClosingEJBDAO.UpdateYearEndClosing", param);
    }
    public HashMap deleteYearEndClosing(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "YearEndClosingEJBDAO.DeleteYearEndClosing", param);
    }
}