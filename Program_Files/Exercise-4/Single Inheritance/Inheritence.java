import java.util.Scanner;
class Employee {
    String name;
    double salary;
    void getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
   }
    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary:" + salary);
    }
}
class Manager extends Employee {
    String department;
    void getManagerDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }
    void displayManagerDetails() {
        displayEmployeeDetails(); 
        System.out.println("Department: " + department);
    }
}
public class Inheritence {
    public static void main(String[] args) {
        Manager manager = new Manager();          
        manager.getEmployeeDetails();
        manager.getManagerDetails();
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();      }
}
