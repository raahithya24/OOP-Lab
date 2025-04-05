import java.util.Scanner;

class Course {
    private String courseName;
    private String instructor;
    private double fee;

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getInstructor() { return instructor; }
    public void setInstructor(String instructor) { this.instructor = instructor; }

    public double getFee() { return fee; }
    public void setFee(double fee) {
        if (fee > 0) {
            this.fee = fee;
        } else {
            System.out.println("Invalid fee! Must be greater than 0.");
        }
    }

    public void showCourseDetails() {
        System.out.println("\nCourse Details:");
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Fee: " + fee +"/-");
    }
}

public class OnlineCourseEnrollment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course course = new Course();

        System.out.print("Enter Course Name: ");
        course.setCourseName(scanner.nextLine());

        System.out.print("Enter Instructor Name: ");
        course.setInstructor(scanner.nextLine());

        System.out.print("Enter Course Fee: ");
        double fee = scanner.nextDouble();
        course.setFee(fee);

        course.showCourseDetails();

        scanner.close();
    }
}
