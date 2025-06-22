package Week1_AlgorithmsAndDataStructures.Ex5_TaskManagementSystem.Code;


public class TaskLinkedList {

    // Inner class for Node
    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public TaskLinkedList() {
        head = null;
    }

    // Add task at end: O(n)
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        System.out.println("Added: " + task);
    }

    // Search task by ID: O(n)
    public Task searchTask(String taskId) {
        Node curr = head;
        while (curr != null) {
            if (curr.task.getTaskId().equals(taskId)) {
                return curr.task;
            }
            curr = curr.next;
        }
        return null;
    }

    // Traverse: O(n)
    public void displayTasks() {
        System.out.println("Task List:");
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.task);
            curr = curr.next;
        }
    }

    // Delete task by ID: O(n)
    public void deleteTask(String taskId) {
        Node curr = head, prev = null;

        while (curr != null && !curr.task.getTaskId().equals(taskId)) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Task ID " + taskId + " not found!");
            return;
        }

        if (prev == null) {
            head = curr.next; // Deleting head
        } else {
            prev.next = curr.next; // Bypass current
        }
        System.out.println("Deleted: " + curr.task);
    }
}
