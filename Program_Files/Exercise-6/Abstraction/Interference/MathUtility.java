import java.util.Scanner;
interface MathOperations {
    int factorial(int num);
    int gcd(int a, int b);
    boolean isPrime(int num);}
interface AdvancedMathOperations {
    void fibonacci(int terms);
    double power(double base, int exponent);}
class BasicMath implements MathOperations {
    public int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorial(num - 1); }
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b); }
    public boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;   }
        return true; }}
class AdvancedMath implements AdvancedMathOperations {
    public void fibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;       }
        System.out.println();   }
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);  }}
public class MathUtility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicMath basicMath = new BasicMath();
        AdvancedMath advancedMath = new AdvancedMath();
        while (true) {
            System.out.println("\nMath Operations:");
            System.out.println("1. Factorial");
            System.out.println("2. GCD (Greatest Common Divisor)");
            System.out.println("3. Prime Check");
            System.out.println("4. Fibonacci Series");
            System.out.println("5. Exponentiation (Power Calculation)");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    System.out.println("Factorial of " + num + " is " + basicMath.factorial(num));
                    break;  
                case 2:
                    System.out.print("Enter two numbers: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("GCD of " + a + " and " + b + " is " + basicMath.gcd(a, b));
                    break;                  
                case 3:
                    System.out.print("Enter a number: ");
                    int primeCheck = scanner.nextInt();
                    if (basicMath.isPrime(primeCheck))
                        System.out.println(primeCheck + " is a Prime Number.");
                    else
                        System.out.println(primeCheck + " is NOT a Prime Number.");
                    break;                    
                case 4:
                    System.out.print("Enter the number of terms: ");
                    int terms = scanner.nextInt();
                    advancedMath.fibonacci(terms);
                    break;                   
                case 5:
                    System.out.print("Enter base and exponent: ");
                    double base = scanner.nextDouble();
                    int exponent = scanner.nextInt();
                    System.out.println(base + "^" + exponent + " = " + advancedMath.power(base, exponent));
                    break;                   
                case 6:
                    System.out.println("Exiting Math Utility...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }}}}
