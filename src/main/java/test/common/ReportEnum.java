package test.common;

/**
 * Created by K316940 on 10-05-2017.
 */
public enum ReportEnum {
    UNITED_ARAB_EMIRATES_DINAR("AED"),
    SAUDI_RIAL("SAR"),
    TRADE_TYPE_BUY("B"),
    TRADE_TYPE_SELL("S");

    private String value;

    private ReportEnum(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}
