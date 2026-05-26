package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface BenchmarkLocal extends EJBLocalObject {
    HashMap insertBenchmark(DefaultParameters param) throws DefaultEJBException;
    Collection selectBenchmarkList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectBenchmarkDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateBenchmark(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteBenchmark(DefaultParameters param) throws DefaultEJBException;
}