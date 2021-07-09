package product;

import java.io.IOException;
import java.util.List;

public interface LoadPrice {
    List<Product> loadPrice() throws IOException;
}
