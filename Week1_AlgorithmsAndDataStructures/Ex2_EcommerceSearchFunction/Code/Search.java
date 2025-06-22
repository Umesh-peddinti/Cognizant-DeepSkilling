package Week1_AlgorithmsAndDataStructures.Ex2_EcommerceSearchFunction.Code;


import java.util.Arrays;
import java.util.Comparator;

public class Search {

    // Linear Search: O(n)
    public static int linearSearch(Product[] products, String productName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(productName)) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Binary Search: O(log n)
    public static int binarySearch(Product[] products, String productName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = products[mid].getProductName().compareToIgnoreCase(productName);

            if (compare == 0) {
                return mid; // Found
            } else if (compare < 0) {
                left = mid + 1; // Search right
            } else {
                right = mid - 1; // Search left
            }
        }
        return -1; // Not found
    }

    // Sort products by productName (required for binary search)
    public static void sortProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
    }
}
