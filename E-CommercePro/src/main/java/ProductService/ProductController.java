package ProductService;

import java.util.List;

public class ProductController {

	
	private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public List<String> getAllProducts() {
        return productService.getAllProducts();
    }

    public void addProduct(String productName) {
        productService.addProduct(productName);
    }
}
