package calculate;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CountPurchasesTest {

    @Test
    public void testCountPurchases() {
        CountPurchasesImpl count = mock(CountPurchasesImpl.class);
        when(count.countPurchases("")).thenReturn(new HashMap<>());
        //assertEquals(count.countPurchases(anyString()),new HashMap<>());
        assertNotNull(count.countPurchases(""));
    }

}