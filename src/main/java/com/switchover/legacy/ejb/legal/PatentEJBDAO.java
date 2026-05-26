package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PatentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/legal/125_patent/Patent_SQL.xml";
    public HashMap insertPatent(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PatentEJBDAO.InsertPatent", param);
    }
    public Collection selectPatentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PatentEJBDAO.SelectPatentList", param);
    }
    public HashMap selectPatentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PatentEJBDAO.SelectPatentDetail", param);
    }
    public HashMap updatePatent(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PatentEJBDAO.UpdatePatent", param);
    }
    public HashMap deletePatent(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PatentEJBDAO.DeletePatent", param);
    }
}