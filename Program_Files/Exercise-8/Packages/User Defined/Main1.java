package raahi;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library lib = new Library();

        System.out.print("Enter book name to borrow: ");
        String borrow = scanner.nextLine();
        lib.borrowBook(borrow);

        System.out.print("Enter book name to return: ");
        String ret = scanner.nextLine();
        lib.returnBook(ret);

        System.out.print("Enter book name to search: ");
        String search = scanner.nextLine();
        lib.searchBook(search);

        scanner.close();
    }
}
