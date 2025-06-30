package Week1_AlgorithmsAndDataStructures.Ex3_CustomerOrderSorting.Code;


public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 99.99),
            new Order("O003", "Charlie", 500.00),
            new Order("O004", "Diana", 150.75)
        };

        System.out.println("Original Orders:");
        Sorter.printOrders(orders);

        // Bubble Sort
        Order[] bubbleSortedOrders = orders.clone();
        Sorter.bubbleSort(bubbleSortedOrders);
        System.out.println("\nOrders after Bubble Sort:");
        Sorter.printOrders(bubbleSortedOrders);

        // Quick Sort
        Order[] quickSortedOrders = orders.clone();
        Sorter.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        Sorter.printOrders(quickSortedOrders);
    }
}
