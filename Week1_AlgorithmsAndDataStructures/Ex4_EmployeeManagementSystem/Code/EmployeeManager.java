package Week1_AlgorithmsAndDataStructures.Ex4_EmployeeManagementSystem.Code;

public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add employee: O(1)
    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
            System.out.println("Added: " + employee);
        } else {
            System.out.println("Employee array is full!");
        }
    }

    // Search employee by ID: O(n)
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null; // Not found
    }

    // Traverse employees: O(n)
    public void displayAllEmployees() {
        System.out.println("Employee List:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete employee by ID: O(n)
    public void deleteEmployee(String employeeId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // Shift left to fill gap
            for (int i = index; i < count - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[count - 1] = null;
            count--;
            System.out.println("Deleted employee with ID: " + employeeId);
        } else {
            System.out.println("Employee ID " + employeeId + " not found!");
        }
    }
}
