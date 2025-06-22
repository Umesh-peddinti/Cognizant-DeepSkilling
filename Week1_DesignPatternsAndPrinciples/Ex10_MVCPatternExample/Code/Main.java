package Week1_DesignPatternsAndPrinciples.Ex10_MVCPatternExample.Code;

public class Main {
    public static void main(String[] args) {
        // Create Model
        Student student = new Student();
        student.setName("John Doe");
        student.setId("S123");
        student.setGrade("A");

        
        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        // Initial details
        controller.updateView();

        System.out.println();

        // Update model data through controller
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("A+");

        // Show updated details
        controller.updateView();
    }
}