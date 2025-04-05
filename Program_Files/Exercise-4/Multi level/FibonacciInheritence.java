import java.util.Scanner;

class Number {
    int n;
    
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        n = sc.nextInt();
        sc.close();
    }
}

class Fibonacci extends Number {
    int[] fibonacciSeries;

    void generateFibonacci() {
        fibonacciSeries = new int[n];
        fibonacciSeries[0] = 0;
        if (n > 1) {
            fibonacciSeries[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
            }
        }
    }
}

class FibonacciSum extends Fibonacci {
    int sum = 0;

    void calculateSum() {
        for (int num : fibonacciSeries) {
            sum += num;
        }
    }

    void display() {
        System.out.println("Fibonacci Series: ");
        for (int num : fibonacciSeries) {
            System.out.println(num + " ");
        }
        System.out.println("Sum of Fibonacci Series: " + sum);
    }
}

public class FibonacciInheritence {
    public static void main(String[] args) {
        FibonacciSum obj = new FibonacciSum();
        obj.getInput();
        obj.generateFibonacci();
        obj.calculateSum();
        obj.display();
    }
}
