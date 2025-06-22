package Week1_AlgorithmsAndDataStructures.Ex5_TaskManagementSystem.Code;


public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Add tasks
        taskList.addTask(new Task("T001", "Design Module", "In Progress"));
        taskList.addTask(new Task("T002", "Develop Feature", "To Do"));
        taskList.addTask(new Task("T003", "Test Application", "To Do"));

        System.out.println();

        // Display tasks
        taskList.displayTasks();

        System.out.println();

        // Search for a task
        Task found = taskList.searchTask("T002");
        System.out.println(found != null ? "Found: " + found : "Not found!");

        System.out.println();

        // Delete a task
        taskList.deleteTask("T002");

        System.out.println();

        // Display after deletion
        taskList.displayTasks();
    }
}
