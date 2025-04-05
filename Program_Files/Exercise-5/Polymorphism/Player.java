import java.util.Scanner;

class Player {
    String name;
    String sport;
    int matches;
    int totalScore;

    Player() {
        name = "Unknown";
        sport = "Unknown";
        matches = 0;
        totalScore = 0;
    }

    Player(String playerName, String playerSport) {
        name = playerName;
        sport = playerSport;
        matches = 0;
        totalScore = 0;
    }

    Player(String playerName, String playerSport, int games, int score) {
        name = playerName;
        sport = playerSport;
        matches = games;
        totalScore = score;
    }

    void showPerformance() {
        double average = (matches > 0) ? (double) totalScore / matches : 0;
        System.out.println("\nPlayer: " + name);
        System.out.println("Sport: " + sport);
        System.out.println("Matches Played: " + matches);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score per Match: " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player Name: ");
        String playerName = sc.nextLine();

        System.out.print("Enter Sport Name: ");
        String playerSport = sc.nextLine();

        System.out.print("Enter Matches Played: ");
        int matches = sc.nextInt();

        System.out.print("Enter Total Score: ");
        int totalScore = sc.nextInt();

        Player userPlayer = new Player(playerName, playerSport, matches, totalScore);
    
        userPlayer.showPerformance();


        sc.close();
    }
}
