package OrderService;

import java.util.List;

public class OrderController {
	 private OrderService orderService;

	    public OrderController(OrderService orderService) {
	        this.orderService = orderService;
	    }

	    public void placeOrder(List<String> products) {
	        orderService.placeOrder(products);
	    }
}
