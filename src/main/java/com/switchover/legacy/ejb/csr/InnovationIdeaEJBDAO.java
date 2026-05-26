package com.switchover.legacy.ejb.csr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class InnovationIdeaEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/csr/199_innovationidea/InnovationIdea_SQL.xml";
    public HashMap insertInnovationIdea(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InnovationIdeaEJBDAO.InsertInnovationIdea", param);
    }
    public Collection selectInnovationIdeaList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "InnovationIdeaEJBDAO.SelectInnovationIdeaList", param);
    }
    public HashMap selectInnovationIdeaDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InnovationIdeaEJBDAO.SelectInnovationIdeaDetail", param);
    }
    public HashMap updateInnovationIdea(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InnovationIdeaEJBDAO.UpdateInnovationIdea", param);
    }
    public HashMap deleteInnovationIdea(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InnovationIdeaEJBDAO.DeleteInnovationIdea", param);
    }
}