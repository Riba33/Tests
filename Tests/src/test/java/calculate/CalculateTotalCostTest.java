package calculate;

import org.junit.Test;
import product.LoadPriceImpl;
import product.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateTotalCostTest {

    private CalculateTotalCost cost = new CalculateTotalCost();
    private List<Product> listPrice;

    {
        try {
            listPrice = new LoadPriceImpl().loadPrice();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void should_Zero_WhenString_Null() {
        assertEquals(0.0,cost.calculateTotalCost("",listPrice),0);

    }
    @Test
    public void should_Zero_WhenString_IncludingAnyOutOfProduct() {
        assertEquals(0.0,cost.calculateTotalCost("1245qwertyuiop",listPrice),0);

    }
    @Test
    public void should_DifferentResult_When_DifferentString() throws IOException {
        LoadPriceImpl load = mock(LoadPriceImpl.class);
        List<Product> listPriseAsMock = new ArrayList<>();
        listPriseAsMock.add(new Product("A",1.25,3.00,3));
        listPriseAsMock.add(new Product("B",4.25));
        listPriseAsMock.add(new Product("C",1.00,5.00,6));
        listPriseAsMock.add(new Product("D",0.75));
        when(load.loadPrice()).thenReturn(listPriseAsMock);

        assertEquals(1.25,cost.calculateTotalCost("A",load.loadPrice()),0);
        assertEquals(3.00,cost.calculateTotalCost("AAA",listPrice),0);
        assertEquals(4.25,cost.calculateTotalCost("B",listPrice),0);
        assertEquals(5.00,cost.calculateTotalCost("cccccc",listPrice),0);
        assertEquals(15.25,cost.calculateTotalCost("AcAcdAccacccb",listPrice),0);
    }

}