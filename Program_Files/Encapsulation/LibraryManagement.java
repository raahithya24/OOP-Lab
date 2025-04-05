import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Price must be positive.");
        }
    }

    public void showBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price+"/-");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 499.99);
        book1.showBookDetails();

        book1.setPrice(599.00);
        System.out.println("\nUpdated Book Price: " + book1.getPrice()+"/-");
    }
}
