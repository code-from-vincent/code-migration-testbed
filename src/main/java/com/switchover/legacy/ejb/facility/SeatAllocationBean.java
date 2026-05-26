package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SeatAllocationBean extends DefaultSession {
    private final SeatAllocationEJBDAO seatAllocationEJBDAO = new SeatAllocationEJBDAO();
    public HashMap insertSeatAllocation(DefaultParameters param) throws DefaultEJBException {
        return seatAllocationEJBDAO.insertSeatAllocation(param);
    }
    public Collection selectSeatAllocationList(DefaultParameters param) throws DefaultEJBException {
        return seatAllocationEJBDAO.selectSeatAllocationList(param);
    }
    public HashMap selectSeatAllocationDetail(DefaultParameters param) throws DefaultEJBException {
        return seatAllocationEJBDAO.selectSeatAllocationDetail(param);
    }
    public HashMap updateSeatAllocation(DefaultParameters param) throws DefaultEJBException {
        return seatAllocationEJBDAO.updateSeatAllocation(param);
    }
    public HashMap deleteSeatAllocation(DefaultParameters param) throws DefaultEJBException {
        return seatAllocationEJBDAO.deleteSeatAllocation(param);
    }
}