import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile{
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("filewriting.txt");
            writer.write("This code is an example of file writing in file handling");
            writer.close();
            System.out.println("Successfully wrote info to the file.");
        } catch (IOException e) {
            System.out.println("An error found.");
            e.printStackTrace();
        }
    }
}