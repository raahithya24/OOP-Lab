import java.util.*;
import java.io.*;

public class ReverseNames{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        
        System.out.println("Enter names (type 'done' to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            names.add(name);
        }

        Collections.reverse(names);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("reversed_names.txt"))) {
            for (String name : names) {
                writer.write(name + "\n");
            }
            System.out.println("Names saved in reverse order.");
        } catch (IOException e) {
            System.err.println("Error saving names: " + e.getMessage());
        }
    }
}
