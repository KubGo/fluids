package models.massBalance;

import models.units.MassFlowRate;

public interface MassBalanceInterface {
    public double getInletMassFlowRate();
    public double getOutletMassFlowRate();
}
