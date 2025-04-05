class PowerCalculator {
    int power(int x) {
        return x * x;
    }

    int power(int x, int exponent) {
        return x * x * x;
    }

    public static void main(String[] args) {
        PowerCalculator obj = new PowerCalculator();
        System.out.println("Square of 5: " + obj.power(9)); 
        System.out.println("Cube of 3: " + obj.power(5, 7)); 
    }
}
