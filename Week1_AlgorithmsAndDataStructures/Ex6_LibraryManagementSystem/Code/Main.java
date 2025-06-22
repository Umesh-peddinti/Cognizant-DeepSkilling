package Week1_AlgorithmsAndDataStructures.Ex6_LibraryManagementSystem.Code;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);

        // Add books
        library.addBook(new Book("B001", "Java Programming", "Alice"));
        library.addBook(new Book("B002", "Data Structures", "Bob"));
        library.addBook(new Book("B003", "Algorithms", "Charlie"));
        library.addBook(new Book("B004", "Design Patterns", "Diana"));

        System.out.println();

        // Display all books
        library.displayBooks();

        System.out.println();

        // Linear search
        Book foundLinear = library.linearSearchByTitle("Algorithms");
        System.out.println(foundLinear != null ? "Found (Linear): " + foundLinear : "Not found!");

        // Binary search
        Book foundBinary = library.binarySearchByTitle("Algorithms");
        System.out.println(foundBinary != null ? "Found (Binary): " + foundBinary : "Not found!");
    }
}
