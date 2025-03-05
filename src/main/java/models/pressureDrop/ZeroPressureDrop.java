package models.pressureDrop;

import models.units.Pressure;

public class ZeroPressureDrop implements PressureDropInterface{
    private Pressure inletPressure;
    private Pressure outletPressure;
    final private Pressure pressureDrop = new Pressure(0.0);

    public ZeroPressureDrop(double inletPressure, double outletPressure) {
        this.inletPressure = new Pressure(inletPressure);
        this.outletPressure = new Pressure(outletPressure);
    }

    public ZeroPressureDrop(double pressure) {
        this(pressure, pressure);
    }

    @Override
    public double getPressureDrop() {
        return pressureDrop.getValue();
    }
}
