import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound{
    public static void main(String[] args) {
        File file = new File("filereading.txt"); 

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Please check the file path.");
        }
    }
}
