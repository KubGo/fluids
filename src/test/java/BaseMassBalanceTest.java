import models.massBalance.BaseMassBalance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class BaseMassBalanceTest {

    @Test
    @DisplayName("Check if inlet and outlet mass flow rates are equal")
    public void testMassFlowRates(){
        BaseMassBalance mb = new BaseMassBalance(10);
        Assertions.assertEquals(
                mb.getInletMassFlowRate(),
                -1 * mb.getOutletMassFlowRate(),
                0.001
        );
    }
    @Test
    @DisplayName("Check if increasing mass flow rate doesn't change difference")
    public void testIncreasingMassFlowRate(){
        BaseMassBalance mb = new BaseMassBalance(1);
        double[] diffs = new double[10];
        for (int i = 0; i < 10; i++){
            mb.updateMassFlowRate(mb.getInletMassFlowRate() + i);
            diffs[i] = mb.getOutletMassFlowRate() + mb.getInletMassFlowRate();
        }
        double[] expected = new double[10];
        Arrays.fill(expected, 0);
        Assertions.assertArrayEquals(expected,diffs, 0.01);
    }
}
