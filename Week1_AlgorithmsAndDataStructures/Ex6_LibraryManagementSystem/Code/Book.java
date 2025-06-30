package Week1_AlgorithmsAndDataStructures.Ex6_LibraryManagementSystem.Code;


public class Book implements Comparable<Book> {
    private String bookId;
    private String title;
    private String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Book[ID=" + bookId + ", Title=" + title + ", Author=" + author + "]";
    }

    // For binary search, sort by title
    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }
}
