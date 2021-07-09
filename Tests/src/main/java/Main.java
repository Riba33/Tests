import calculate.CalculateTotalCost;
import product.LoadPrice;
import product.Product;

import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        List<Product> listPrice = new LoadPrice().loadPrice();

        System.out.println(new CalculateTotalCost().calculateTotalCost("1234",listPrice));

    }
}
