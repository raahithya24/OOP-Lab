import java.util.Scanner;

class InvalidLoginException extends Exception {
    public InvalidLoginException(String message) {
        super(message);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "1234";

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
                throw new InvalidLoginException("Incorrect username or password!");
            }

            System.out.println("Login successful!");

        } catch (InvalidLoginException e) {
            System.out.println("Login failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
