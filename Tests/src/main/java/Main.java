import calculate.CalculateTotalCost;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Total cost is: " + new CalculateTotalCost().calculateTotalCost(" ABCDABA"));

    }
}
