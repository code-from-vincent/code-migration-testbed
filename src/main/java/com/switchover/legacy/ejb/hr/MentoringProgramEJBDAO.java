package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class MentoringProgramEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/hr/198_mentoringprogram/MentoringProgram_SQL.xml";
    public HashMap insertMentoringProgram(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MentoringProgramEJBDAO.InsertMentoringProgram", param);
    }
    public Collection selectMentoringProgramList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "MentoringProgramEJBDAO.SelectMentoringProgramList", param);
    }
    public HashMap selectMentoringProgramDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MentoringProgramEJBDAO.SelectMentoringProgramDetail", param);
    }
    public HashMap updateMentoringProgram(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MentoringProgramEJBDAO.UpdateMentoringProgram", param);
    }
    public HashMap deleteMentoringProgram(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MentoringProgramEJBDAO.DeleteMentoringProgram", param);
    }
}