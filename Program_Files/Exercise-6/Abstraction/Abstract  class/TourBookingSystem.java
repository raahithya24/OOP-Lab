import java.util.Scanner;

abstract class TourPackage {
    protected String packageName;
    protected double pricePerPerson;

    public TourPackage(String packageName, double pricePerPerson) {
        this.packageName = packageName;
        this.pricePerPerson = pricePerPerson;
    }

    abstract void showItinerary();

    public double calculateTotalCost(int numPeople, int days) {
        return numPeople * pricePerPerson * days;
    }
}

class AdventureTour extends TourPackage {
    public AdventureTour() {
        super("Adventure Tour", 100);
    }

    void showItinerary() {
        System.out.println("Itinerary: Hiking, Rafting, Camping");
    }
}

class LuxuryTour extends TourPackage {
    public LuxuryTour() {
        super("Luxury Tour", 250);
    }

    void showItinerary() {
        System.out.println("Itinerary: 5-Star Hotels, Private Beaches, Fine Dining");
    }
}

public class TourBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Tour Booking System!");
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.println("\nSelect a Tour Package:");
        System.out.println("1. Adventure Tour (100/- per person/day)");
        System.out.println("2. Luxury Tour (250/- per person/day)");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        TourPackage selectedPackage;
        if (choice == 1) {
            selectedPackage = new AdventureTour();
        } else if (choice == 2) {
            selectedPackage = new LuxuryTour();
        } else {
            System.out.println("Invalid choice! Exiting...");
            return;
        }

        System.out.print("\nEnter number of people: ");
        int numPeople = scanner.nextInt();

        System.out.print("Enter number of days: ");
        int numDays = scanner.nextInt();

        System.out.println("\nBooking Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Selected Package: " + selectedPackage.packageName);
        selectedPackage.showItinerary();
        double totalCost = selectedPackage.calculateTotalCost(numPeople, numDays);
        System.out.println("Total Cost: " + totalCost+"INR");

        System.out.println("\n Booking Confirmed! Enjoy your trip.");
        scanner.close();
    }
}
