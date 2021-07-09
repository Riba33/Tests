import calculate.CalculateTotalCost;
import product.LoadPrice;
import product.LoadPriceImpl;
import product.Product;

import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        LoadPrice loadPrice = new LoadPriceImpl();
        List<Product> listPrice = loadPrice.loadPrice();

        System.out.println(new CalculateTotalCost().calculateTotalCost(" ABCDABA",listPrice));

    }
}
