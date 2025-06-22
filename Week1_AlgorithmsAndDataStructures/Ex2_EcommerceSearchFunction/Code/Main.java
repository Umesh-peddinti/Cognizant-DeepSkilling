package Week1_AlgorithmsAndDataStructures.Ex2_EcommerceSearchFunction.Code;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Mouse", "Electronics"),
            new Product("P003", "Shoes", "Fashion"),
            new Product("P004", "Backpack", "Accessories"),
            new Product("P005", "Watch", "Fashion")
        };

        System.out.println("Searching for 'Shoes' using Linear Search...");
        int linearIndex = Search.linearSearch(products, "Shoes");
        System.out.println(linearIndex >= 0 ? "Found: " + products[linearIndex] : "Product not found.");

        System.out.println("\nSorting products for Binary Search...");
        Search.sortProducts(products);

        System.out.println("Searching for 'Shoes' using Binary Search...");
        int binaryIndex = Search.binarySearch(products, "Shoes");
        System.out.println(binaryIndex >= 0 ? "Found: " + products[binaryIndex] : "Product not found.");
    }
}
