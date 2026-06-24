package mvc;

// Test class to demonstrate the MVC Pattern
public class MVCPatternTest {
    public static void main(String[] args) {
        System.out.println("=== MVC Pattern Example ===\n");

        // Create the Model
        Student student = new Student("Alice Johnson", "STU001", "A");

        // Create the View
        StudentView view = new StudentView();

        // Create the Controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        System.out.println("--- Initial Student Details ---");
        controller.updateView();

        // Update student details using the controller
        System.out.println("\n--- Updating Student Details ---");
        System.out.println("Changing name to 'Alice Williams'...");
        controller.setStudentName("Alice Williams");
        System.out.println("Changing grade to 'A+'...\n");
        controller.setStudentGrade("A+");

        // Display updated student details
        System.out.println("--- Updated Student Details ---");
        controller.updateView();

        // Another update
        System.out.println("\n--- Another Update ---");
        System.out.println("Changing ID to 'STU002'...");
        controller.setStudentId("STU002");
        System.out.println("Changing grade to 'B+'...\n");
        controller.setStudentGrade("B+");

        System.out.println("--- Final Student Details ---");
        controller.updateView();
    }
}
