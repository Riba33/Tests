package calculate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountPurchasesImpl implements CountPurchases{
    @Override
    public Map<String,Integer> countPurchases(String purchases) {
        Map<String,Integer> productNameToAmount = new HashMap<>();
        if (purchases == null) {
            purchases = "";
            System.out.println("Basket is empty!");
        }
        String[] productNames = purchases.toUpperCase().trim().split("");
        Arrays.sort(productNames);
        String stringCompare = productNames[0];
        int count = 0;
        for (int i = 0; i < productNames.length; i++) {
            if (stringCompare.equals(productNames[i])) {
                count++;
                if (i == productNames.length - 1) {
                    productNameToAmount.put(stringCompare,count);
                }
            }
            else {
                productNameToAmount.put(stringCompare,count);
                stringCompare = productNames[i];
                count = 1;
                if (i == productNames.length - 1) {
                    productNameToAmount.put(stringCompare,count);
                }
            }
        }


        return productNameToAmount;
    }
}
