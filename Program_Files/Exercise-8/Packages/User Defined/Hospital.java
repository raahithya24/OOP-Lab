package raahi;

public class Hospital {

    public void registerPatient(String name, int age, String gender) {
        System.out.println("Patient Registered:");
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }

    public void assignDoctor(String department) {
        System.out.println("Doctor assigned to the " + department + " department.");
    }

    public void dischargePatient(String name) {
        System.out.println("Patient '" + name + "' has been discharged.");
    }
}
