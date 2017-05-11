package test.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by K316940 on 10-05-2017.
 */
public class Report {
    String entityId;
    String tradeType;
    String currency;
    Date instructionDate;
    Date settlementDate;
    BigDecimal settledAmount;
    Integer rank;
}
