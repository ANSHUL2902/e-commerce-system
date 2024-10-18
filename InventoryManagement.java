import java.util.List;
import java.util.Map;

class InventoryManagement {
    public void processOrders(List<Product> products, List<Order> orders) {
        for (Order order : orders) {
            for (Product product : order.getProducts()) {
                int stock = getStockLevel(product);
                if (stock < 1) {
                    System.out.println("Product " + product.getName() + " is out of stock.");
                } else {
                    updateStockLevel(product, stock - 1);
                    if (stock - 1 < 10) {
                        System.out.println("Restock needed for product: " + product.getName());
                    }
                }
            }
        }
    }

    public void restockItems(Map<Product, Integer> restockList) {
        for (Map.Entry<Product, Integer> entry : restockList.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Restocking product: " + product.getName() + " with " + quantity + " units.");
            updateStockLevel(product, getStockLevel(product) + quantity);
        }
    }

    private int getStockLevel(Product product) {
        return 20;
    }

    private void updateStockLevel(Product product, int newStock) {
        System.out.println("Updated stock for " + product.getName() + " to " + newStock);
    }
}
