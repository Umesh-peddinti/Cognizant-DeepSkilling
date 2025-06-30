package Week1_AlgorithmsAndDataStructures.Ex1_InventoryManagementSystem.Code;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Added: " + product);
    }

    // Update Product
    public void updateProduct(String productId, String name, int quantity, double price) {
        Product product = products.get(productId);
        if (product != null) {
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Updated: " + product);
        } else {
            System.out.println("Product ID " + productId + " not found!");
        }
    }

    // Delete Product
    public void deleteProduct(String productId) {
        Product removed = products.remove(productId);
        if (removed != null) {
            System.out.println("Deleted: " + removed);
        } else {
            System.out.println("Product ID " + productId + " not found!");
        }
    }

    // Optional: Display all
    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }
}
