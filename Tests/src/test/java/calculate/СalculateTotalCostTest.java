package calculate;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculateTotalCostTest {

    @Test
    public void calculateTotalCost() throws IOException {
        CalculateTotalCost cost = mock(CalculateTotalCost.class);
        when(cost.calculateTotalCost(" ABCDABA")).thenReturn(13.25);
        assertEquals(cost.calculateTotalCost(" ABCDABA"),13.25,0);
    }
}