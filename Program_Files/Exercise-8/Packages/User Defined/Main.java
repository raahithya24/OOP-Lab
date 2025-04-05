package raahi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        hospital.registerPatient(name, age, gender);
        System.out.print("Enter department for doctor assignment: ");
        String department = scanner.nextLine();
        hospital.assignDoctor(department);
        System.out.print("Enter patient name to discharge: ");
        String discharge = scanner.nextLine();
        hospital.dischargePatient(discharge);
        scanner.close();
    }
}
