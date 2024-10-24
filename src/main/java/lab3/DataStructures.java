package lab3;

import java.util.*;

public class DataStructures {
    List<TaskItem> tasks = new ArrayList<>();
    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", TaskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", TaskStatus.COMPLETED));
    }

    public List<TaskItem> getTasks() {
        return this.tasks;
    }

    public List<TaskItem> getByStatus(TaskStatus status) {
        List<TaskItem> result = new ArrayList<>();
        for (TaskItem item : this.tasks) {
            if (item.taskStatus == status) {
                result.add(item);
            }
        }
        return result;
    }
    public List<TaskItem> tasksWithIdBiggerThan2() {
        List<TaskItem> result = new ArrayList<>();
        for (TaskItem item : this.tasks) {
            if(item.id>1){
                result.add(item);
            }
        }
        return result;
    }
    public void printDescription(){
        tasks.stream().forEach(item -> System.out.println(item.text));
    }
}
