package com.switchover.legacy.ejb.csr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class VolunteerActivityEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/csr/197_volunteeractivity/VolunteerActivity_SQL.xml";
    public HashMap insertVolunteerActivity(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VolunteerActivityEJBDAO.InsertVolunteerActivity", param);
    }
    public Collection selectVolunteerActivityList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "VolunteerActivityEJBDAO.SelectVolunteerActivityList", param);
    }
    public HashMap selectVolunteerActivityDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VolunteerActivityEJBDAO.SelectVolunteerActivityDetail", param);
    }
    public HashMap updateVolunteerActivity(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VolunteerActivityEJBDAO.UpdateVolunteerActivity", param);
    }
    public HashMap deleteVolunteerActivity(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VolunteerActivityEJBDAO.DeleteVolunteerActivity", param);
    }
}