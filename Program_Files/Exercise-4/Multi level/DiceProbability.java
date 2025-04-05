import java.util.Random;
import java.util.Scanner;

class Game {
    int rolls;  

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want to roll the dice: ");
        rolls = sc.nextInt();
        sc.close();
    }
}

class Dice extends Game {
    int[] outcomes;

    void rollDice() {
        Random rand = new Random();
        outcomes = new int[rolls];
        for (int i = 0; i < rolls; i++) {
            outcomes[i] = rand.nextInt(6) + 1; 
        }
    }
}

class Probability extends Dice {
    double probabilityOfSix;

    void calculateProbability() {
        int countSix = 0;
        for (int outcome : outcomes) {
            if (outcome == 6) {
                countSix++;
            }
        }
        probabilityOfSix = (double) countSix / rolls;
    }

    void display() {
        System.out.print("Dice Rolls: ");
        for (int num : outcomes) {
            System.out.print(num + " ");
        }
        System.out.println("\nTimes 6 appeared: " + (int) (probabilityOfSix * rolls));
        System.out.println("Probability of rolling a 6: " + probabilityOfSix);
    }
}

public class DiceProbability {
    public static void main(String[] args) {
        Probability obj = new Probability();
        obj.getInput();
        obj.rollDice();
        obj.calculateProbability();
        obj.display();
    }
}
