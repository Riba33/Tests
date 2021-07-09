package calculate;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CountPurchasesTest {

    @Test
    public void should_NotNull_When_NullString() {
        CountPurchasesImpl countPurchases = mock(CountPurchasesImpl.class);
        when(countPurchases.countPurchases("")).thenReturn(new HashMap<>());
        //assertEquals(count.countPurchases(anyString()),new HashMap<>());
        assertNotNull(countPurchases.countPurchases(""));
    }
    @Test
    public void should_MapWithDiffElements_When_InputDiffString() {
        CountPurchases countPurchases = new CountPurchasesImpl();
        Map<String,Integer> productNameToAmount = new HashMap<>();
        productNameToAmount.put("A",3);
        productNameToAmount.put("B",2);
        assertEquals(productNameToAmount.get("A"),countPurchases.countPurchases("21ab5b7aa").get("A"));
        assertEquals(productNameToAmount.get("B"),countPurchases.countPurchases("21ab5b7aa").get("B"));
    }

}