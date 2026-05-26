package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PartnerSettlementEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/sales/106_partnersettlement/PartnerSettlement_SQL.xml";
    public HashMap insertPartnerSettlement(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PartnerSettlementEJBDAO.InsertPartnerSettlement", param);
    }
    public Collection selectPartnerSettlementList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PartnerSettlementEJBDAO.SelectPartnerSettlementList", param);
    }
    public HashMap selectPartnerSettlementDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PartnerSettlementEJBDAO.SelectPartnerSettlementDetail", param);
    }
    public HashMap updatePartnerSettlement(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PartnerSettlementEJBDAO.UpdatePartnerSettlement", param);
    }
    public HashMap deletePartnerSettlement(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PartnerSettlementEJBDAO.DeletePartnerSettlement", param);
    }
}