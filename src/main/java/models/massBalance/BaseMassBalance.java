package models.massBalance;

import models.units.MassFlowRate;

public class BaseMassBalance implements MassBalanceInterface{

    private MassFlowRate inletMassFlowRate;
    private MassFlowRate outletMassFlowRate;

    public BaseMassBalance(double massFlowRate) {
        this.inletMassFlowRate = new MassFlowRate(massFlowRate);
        this.outletMassFlowRate = new MassFlowRate(-massFlowRate);
    }

    @Override
    public double getInletMassFlowRate() {
        return this.inletMassFlowRate.getValue();
    }

    @Override
    public double getOutletMassFlowRate() {
        return this.outletMassFlowRate.getValue();
    }
    public void updateMassFlowRate(double massFlowRate){
        this.inletMassFlowRate.setValue(massFlowRate);
        this.outletMassFlowRate.setValue(-massFlowRate);
    }
}
