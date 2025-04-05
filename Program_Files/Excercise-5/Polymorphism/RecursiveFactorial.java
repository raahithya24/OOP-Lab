class Factorial {
    int calculate(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

class RecursiveFactorial extends Factorial {
    int calculate(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculate(n - 1);
    }

    public static void main(String[] args) {
        Factorial iterative = new Factorial();
        RecursiveFactorial recursive = new RecursiveFactorial();

        int num = 9;
        System.out.println("Factorial of " + num + " (Iterative): " + iterative.calculate(num));
        System.out.println("Factorial of " + num + " (Recursive): " + recursive.calculate(num));
    }
}
