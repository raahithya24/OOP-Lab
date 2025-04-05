import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private int seats;
    private double ticketPrice;

    public MovieTicket(String movieName, int seats, double ticketPrice) {
        this.movieName = movieName;
        setSeats(seats);
        setTicketPrice(ticketPrice);
    }

    public String getMovieName() { return movieName; }
    public int getSeats() { return seats; }
    public double getTicketPrice() { return ticketPrice; }

    public void setSeats(int seats) {
        if (seats > 0 && seats <= 10) {
            this.seats = seats;
        } else {
            System.out.println("Invalid seat count! Must be between 1 and 10.");
        }
    }

    public void setTicketPrice(double ticketPrice) {
        if (ticketPrice > 0) {
            this.ticketPrice = ticketPrice;
        } else {
            System.out.println("Invalid ticket price!");
        }
    }

    public double calculateTotalCost() {
        return seats * ticketPrice;
    }

    public void showBookingDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seats Booked: " + seats);
        System.out.println("Total Cost: " + calculateTotalCost()+"/-");
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of seats (Max 10): ");
        int seats = scanner.nextInt();

        System.out.print("Enter ticket price per seat: ");
        double price = scanner.nextDouble();

        MovieTicket booking = new MovieTicket(name, seats, price);
        booking.showBookingDetails();

        scanner.close();
    }
}
