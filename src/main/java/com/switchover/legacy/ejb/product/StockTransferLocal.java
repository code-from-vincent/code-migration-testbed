package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface StockTransferLocal extends EJBLocalObject {
    HashMap insertStockTransfer(DefaultParameters param) throws DefaultEJBException;
    Collection selectStockTransferList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectStockTransferDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateStockTransfer(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteStockTransfer(DefaultParameters param) throws DefaultEJBException;
}