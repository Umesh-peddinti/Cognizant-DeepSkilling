package Week1_AlgorithmsAndDataStructures.Ex5_TaskManagementSystem.Code;

public class Task {
    private String taskId;
    private String taskName;
    private String status;

    public Task(String taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public String getTaskId() { return taskId; }
    public String getTaskName() { return taskName; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Task[ID=" + taskId + ", Name=" + taskName + ", Status=" + status + "]";
    }
}
