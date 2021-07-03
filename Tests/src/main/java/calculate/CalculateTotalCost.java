package calculate;

import product.LoadProducts;
import product.Product;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CalculateTotalCost {
    public Double calculateTotalCost(String purchases) throws IOException {
        double totalCoast = 0.00D;
        Map<String,Integer> map = new CountPurchases().countPurchases(purchases);
        List<Product> list = new LoadProducts().loadProducts();
        for (Product product: list) {
            int count = map.get(product.getName());
            int stockAmount = product.getStockAmount();
            Double price = product.getPrice();
            Double stockPrice = product.getStockPrice();
            if (product.getStockAmount() > 0) {
                totalCoast += (stockPrice * (count / stockAmount) + price * (count % stockAmount));
            }
            else totalCoast += price * count;
        }

        return totalCoast;
    }

}
