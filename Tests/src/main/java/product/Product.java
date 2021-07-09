package product;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NonNull;

@Data
@NonNull
public class Product {
    @SerializedName("name")
    private String name;
    @SerializedName("price")
    private Double price;
    @SerializedName("stockPrice")
    private Double stockPrice;
    @SerializedName("stockAmount")
    private int stockAmount;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
        this.stockAmount = 0;
    }
    public Product(String name, Double price, Double stockPrice, int stockAmount) {
        this.name = name;
        this.price = price;
        this.stockPrice = stockPrice;
        this.stockAmount = stockAmount;
    }
}
