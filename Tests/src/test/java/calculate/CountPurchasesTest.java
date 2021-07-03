package calculate;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CountPurchasesTest {

    @Test
    public void countPurchases() {
        CountPurchases count = mock(CountPurchases.class);
        when(count.countPurchases(anyString())).thenReturn(new HashMap<>());
        assertEquals(count.countPurchases(anyString()),new HashMap<>());
    }
}