package models.units;

import java.util.Objects;

public abstract class AbstractUnit {
    private double value;
    private String quantity;
    private String unit;

    public AbstractUnit(double value, String quantity, String unit) {
        this.value = value;
        this.quantity = quantity;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AbstractUnit that = (AbstractUnit) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public String toString() {
        return quantity + ": " + getValue() + " " + unit;
    }

}
