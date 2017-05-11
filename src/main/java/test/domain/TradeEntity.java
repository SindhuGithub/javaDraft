package test.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by K316940 on 10-05-2017.
 */
public class TradeEntity {
    String entityId;
    String tradeType;
    BigDecimal agreedFx;
    String currency;
    Date instructionDate;
    Date settlementDate;
    Integer units;
    BigDecimal rate;
    BigDecimal usdAmount;

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public BigDecimal getAgreedFx() {
        return agreedFx;
    }

    public void setAgreedFx(BigDecimal agreedFx) {
        this.agreedFx = agreedFx;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getInstructionDate() {
        return instructionDate;
    }

    public void setInstructionDate(Date instructionDate) {
        this.instructionDate = instructionDate;
    }

    public Date getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Date settlementDate) {
        this.settlementDate = settlementDate;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getUsdAmount() {
        BigDecimal usdAmt = this.getRate().multiply(BigDecimal.valueOf(this.getUnits())).multiply(this.getAgreedFx());
        return usdAmt;
    }

    public void setUsdAmount(BigDecimal usdAmount) {
        this.usdAmount = usdAmount;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TradeEntity that = (TradeEntity) o;

        if (!entityId.equals(that.entityId)) return false;
        return instructionDate.equals(that.instructionDate);

    }

    @Override
    public int hashCode() {
        int result = entityId.hashCode();
        result = 31 * result + instructionDate.hashCode();
        return result;
    }
}
