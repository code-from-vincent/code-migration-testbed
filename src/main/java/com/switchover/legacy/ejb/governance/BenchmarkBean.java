package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class BenchmarkBean extends DefaultSession {
    private final BenchmarkEJBDAO benchmarkEJBDAO = new BenchmarkEJBDAO();
    public HashMap insertBenchmark(DefaultParameters param) throws DefaultEJBException {
        return benchmarkEJBDAO.insertBenchmark(param);
    }
    public Collection selectBenchmarkList(DefaultParameters param) throws DefaultEJBException {
        return benchmarkEJBDAO.selectBenchmarkList(param);
    }
    public HashMap selectBenchmarkDetail(DefaultParameters param) throws DefaultEJBException {
        return benchmarkEJBDAO.selectBenchmarkDetail(param);
    }
    public HashMap updateBenchmark(DefaultParameters param) throws DefaultEJBException {
        return benchmarkEJBDAO.updateBenchmark(param);
    }
    public HashMap deleteBenchmark(DefaultParameters param) throws DefaultEJBException {
        return benchmarkEJBDAO.deleteBenchmark(param);
    }
}