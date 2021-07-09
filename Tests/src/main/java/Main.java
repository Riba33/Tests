import calculate.CalculateTotalCost;
import product.LoadProducts;
import product.Product;

import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        List<Product> listPrice = new LoadProducts().loadProducts();

        System.out.println(new CalculateTotalCost().calculateTotalCost("1234",listPrice));

    }
}
