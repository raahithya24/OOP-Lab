import java.util.Scanner;
public class VowelConsonent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); 
        // Checking if it's a vowel or consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else if (Character.isLetter(ch)) { 
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a valid letter.");
        }

        scanner.close();
    }
}
