package Week1_AlgorithmsAndDataStructures.Ex6_LibraryManagementSystem.Code;

import java.util.Arrays;

public class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
            System.out.println("Added: " + book);
        } else {
            System.out.println("Library is full!");
        }
    }

    // Linear Search: O(n)
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary Search: O(log n) - requires sorted array!
    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, 0, count); // Ensure sorted before searching
        int low = 0, high = count - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);

            if (cmp == 0) return books[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }

        return null;
    }

    public void displayBooks() {
        System.out.println("Book List:");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
