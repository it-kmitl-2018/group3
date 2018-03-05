package th.ac.kmitl.it.soa.group3.model.supplychaintradetransaction;

import lombok.Builder;

@Builder(builderClassName = "Builder")
public class SpecifiedTradeAllowanceChargeModel {

    public boolean chargeIndicator;
    public double actualAmount;
    public String reasonCode;
    public String reason;
}