package models.massBalance;

public class BaseMassBalance implements MassBalanceInterface{

    private double inletMassFlowRate;
    private double outletMassFlowRate;

    public BaseMassBalance(double massFlowRate) {
        this.inletMassFlowRate = massFlowRate;
        this.outletMassFlowRate = -massFlowRate;
    }

    @Override
    public double getInletMassFlowRate() {
        return this.inletMassFlowRate;
    }

    @Override
    public double getOutletMassFlowRate() {
        return this.outletMassFlowRate;
    }
    public void updateMassFlowRate(double massFlowRate){
        inletMassFlowRate = massFlowRate;
        outletMassFlowRate = -massFlowRate;
    }
}
