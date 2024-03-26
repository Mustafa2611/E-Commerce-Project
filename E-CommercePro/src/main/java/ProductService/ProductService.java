package ProductService;

import java.util.Arrays;
import java.util.List;

public class ProductService {

	public List<String> getAllProducts() {
        // Simulated product retrieval logic
        return Arrays.asList("Product 1", "Product 2", "Product 3");
    }
	
	public void addProduct(String productName) {
        // Simulated product addition logic
        System.out.println("Product added: " + productName);
    }
}
