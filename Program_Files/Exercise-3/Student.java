import java.util.Scanner;
public class Student {
String name;
int age;
    public void displayInfo() {
        String status = (age >= 18) ? "Adult" : "Minor"; 
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Status: " + status); 
    }

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Student student1 = new Student();
System.out.print("Enter first student's name: ");
student1.name = scanner.nextLine();
System.out.print("Enter first student's age: ");
student1.age = scanner.nextInt();
scanner.nextLine(); // Consume newline

student1.displayInfo();

scanner.close();
    }
}
