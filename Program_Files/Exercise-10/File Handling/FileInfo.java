import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File file = new File("fileInformations.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("File size in bytes: " + file.length());
            System.out.println("Is directory: " + file.isDirectory());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}