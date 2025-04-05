import java.util.Scanner;

class AgeCalculator {
    int calculateAge(int birthYear, int currentYear) {
        return currentYear - birthYear;
    }

    int calculateAge(int birthYear, int currentYear, int birthMonth, int currentMonth) {
        int years = currentYear - birthYear;
        int months = (years * 12) + (currentMonth - birthMonth);
        return months;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter birth month (1-12): ");
        int birthMonth = sc.nextInt();

        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();

        System.out.print("Enter current month (1-12): ");
        int currentMonth = sc.nextInt();

        AgeCalculator obj = new AgeCalculator();
        int ageInYears = obj.calculateAge(birthYear, currentYear);
        int ageInMonths = obj.calculateAge(birthYear, currentYear, birthMonth, currentMonth);

        System.out.println("\nYour age in years: " + ageInYears);
        System.out.println("Your age in months: " + ageInMonths);

        sc.close();
    }
}
