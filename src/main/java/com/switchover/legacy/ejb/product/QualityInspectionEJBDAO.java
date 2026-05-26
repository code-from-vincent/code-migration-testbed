package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class QualityInspectionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/product/048_qualityinspection/QualityInspection_SQL.xml";
    public HashMap insertQualityInspection(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "QualityInspectionEJBDAO.InsertQualityInspection", param);
    }
    public Collection selectQualityInspectionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "QualityInspectionEJBDAO.SelectQualityInspectionList", param);
    }
    public HashMap selectQualityInspectionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "QualityInspectionEJBDAO.SelectQualityInspectionDetail", param);
    }
    public HashMap updateQualityInspection(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "QualityInspectionEJBDAO.UpdateQualityInspection", param);
    }
    public HashMap deleteQualityInspection(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "QualityInspectionEJBDAO.DeleteQualityInspection", param);
    }
}