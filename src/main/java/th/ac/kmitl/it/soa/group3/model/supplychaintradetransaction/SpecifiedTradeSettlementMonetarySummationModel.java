package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;

@Builder(builderClassName = "Builder")
public class SpecifiedTradeSettlementMonetarySummationModel {

    public double taxTotalAmount;
    public double netLineTotalAmount;
    public double netIncludingTaxesLineTotalAmount;
}