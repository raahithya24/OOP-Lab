import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int reverse = 0;

            for (; num > 0; num /= 10) { 
            int digit = num % 10; 
            reverse = reverse * 10 + digit;         }
        System.out.println("Reversed Number: " + reverse);

        scanner.close();
    }
}
