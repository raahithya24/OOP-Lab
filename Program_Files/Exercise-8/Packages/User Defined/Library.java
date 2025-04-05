package raahi;

public class Library {

    public void borrowBook(String bookName) {
        System.out.println("Book '" + bookName + "' has been borrowed.");
    }

    public void returnBook(String bookName) {
        System.out.println("Book '" + bookName + "' has been returned.");
    }

    public void searchBook(String bookName) {
        System.out.println("Searching for book: " + bookName + "...");
        System.out.println("Book '" + bookName + "' is available in the library.");
    }
}
