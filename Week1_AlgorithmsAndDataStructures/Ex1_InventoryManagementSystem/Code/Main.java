package Week1_AlgorithmsAndDataStructures.Ex1_InventoryManagementSystem.Code;


public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add products
        Product p1 = new Product("P001", "Laptop", 10, 999.99);
        Product p2 = new Product("P002", "Mouse", 50, 19.99);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        System.out.println();

        // Update a product
        inventory.updateProduct("P001", "Gaming Laptop", 8, 1299.99);

        System.out.println();

        // Delete a product
        inventory.deleteProduct("P002");

        System.out.println();

        // Display remaining products
        inventory.displayInventory();
    }
}
