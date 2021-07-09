package calculate;

import product.Product;

import java.util.List;
import java.util.Map;

public class CalculateTotalCost {
    public Double calculateTotalCost(String purchases, List<Product> listPrice) {
        double totalCoast = 0.00D;
        CountPurchases countPurchases = new CountPurchasesImpl();
        Map<String,Integer> productNameToAmount = countPurchases.countPurchases(purchases);
        for (Product product: listPrice) {
            if (productNameToAmount.get(product.getName()) == null) continue;
            int count = productNameToAmount.get(product.getName());

            int stockAmount = product.getStockAmount();
            Double price = product.getPrice();
            Double stockPrice = product.getStockPrice();

            if (stockAmount >= 1) {
                totalCoast += (stockPrice * (count / stockAmount) + price * (count % stockAmount));
            }
            else totalCoast += price * count;
        }

        return totalCoast;
    }

}
