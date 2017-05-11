package test.io;

import test.domain.TradeEntity;

import java.util.List;

/**
 * Created by K316940 on 07-10-2016.
 */
public interface TradeInfoReaderWriter {

    List<TradeEntity> readTradeInstructions();

    void writeTradereport();
}
