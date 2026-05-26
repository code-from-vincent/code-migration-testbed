package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class BenchmarkEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/governance/188_benchmark/Benchmark_SQL.xml";
    public HashMap insertBenchmark(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BenchmarkEJBDAO.InsertBenchmark", param);
    }
    public Collection selectBenchmarkList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "BenchmarkEJBDAO.SelectBenchmarkList", param);
    }
    public HashMap selectBenchmarkDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BenchmarkEJBDAO.SelectBenchmarkDetail", param);
    }
    public HashMap updateBenchmark(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BenchmarkEJBDAO.UpdateBenchmark", param);
    }
    public HashMap deleteBenchmark(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BenchmarkEJBDAO.DeleteBenchmark", param);
    }
}