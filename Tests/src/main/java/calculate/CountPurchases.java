package calculate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountPurchases {
    public Map<String,Integer> countPurchases(String purchases) {
        Map<String,Integer> map = new HashMap<>();
        String[] arPurchases = purchases.toUpperCase().trim().split("");
        Arrays.sort(arPurchases);
        String stringCompare = arPurchases[0];
        int count = 0;
        for (int i = 0; i < arPurchases.length; i++) {
            if (stringCompare.equals(arPurchases[i])) {
                count++;
                if (i == arPurchases.length - 1) {
                    map.put(stringCompare,count);
                }
            }
            else {
                map.put(stringCompare,count);
                stringCompare = arPurchases[i];
                count = 1;
                if (i == arPurchases.length - 1) {
                    map.put(stringCompare,count);
                }
            }
        }


        return map;
    }
}
