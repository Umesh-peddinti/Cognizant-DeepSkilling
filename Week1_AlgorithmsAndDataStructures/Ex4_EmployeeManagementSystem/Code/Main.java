package Week1_AlgorithmsAndDataStructures.Ex4_EmployeeManagementSystem.Code;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        // Add employees
        manager.addEmployee(new Employee("E001", "Alice", "Developer", 60000));
        manager.addEmployee(new Employee("E002", "Bob", "Designer", 55000));
        manager.addEmployee(new Employee("E003", "Charlie", "Manager", 75000));

        System.out.println();

        // Display all
        manager.displayAllEmployees();

        System.out.println();

        // Search
        Employee found = manager.searchEmployee("E002");
        System.out.println(found != null ? "Found: " + found : "Not found!");

        System.out.println();

        // Delete
        manager.deleteEmployee("E002");

        System.out.println();

        // Display all after deletion
        manager.displayAllEmployees();
    }
}
