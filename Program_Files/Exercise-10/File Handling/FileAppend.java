import java.io.*;

public class FileAppend {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("filereading.txt", true); 
            fw.write("\nJava programming is good.");
            fw.close();
            System.out.println("Data appended to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
