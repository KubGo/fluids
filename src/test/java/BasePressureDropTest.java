import models.pressureDrop.ZeroPressureDrop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasePressureDropTest {

    @Test
    @DisplayName("Test if pressure drop is zero for zero pressure drop")
    public void testZeroPressureDrop(){
        ZeroPressureDrop pressureDrop = new ZeroPressureDrop(10000);
        Assertions.assertEquals(0.0, pressureDrop.getPressureDrop(), 0.001);
    }
}
