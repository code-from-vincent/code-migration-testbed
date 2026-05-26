package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PartnerEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/sales/105_partner/Partner_SQL.xml";
    public HashMap insertPartner(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PartnerEJBDAO.InsertPartner", param);
    }
    public Collection selectPartnerList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PartnerEJBDAO.SelectPartnerList", param);
    }
    public HashMap selectPartnerDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PartnerEJBDAO.SelectPartnerDetail", param);
    }
    public HashMap updatePartner(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PartnerEJBDAO.UpdatePartner", param);
    }
    public HashMap deletePartner(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PartnerEJBDAO.DeletePartner", param);
    }
}