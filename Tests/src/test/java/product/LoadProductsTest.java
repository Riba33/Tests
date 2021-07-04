package product;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoadProductsTest {

    @Test
    public void testLoadProducts() throws IOException {
        LoadProducts load = mock(LoadProducts.class);
        when(load.loadProducts()).thenReturn(new ArrayList<Product>());
        assertEquals(load.loadProducts(),new ArrayList<Product>());
    }
}