package lab3;

public class TaskItem {
    int id;
    String text;
    TaskStatus taskStatus;
    public TaskItem(int a, String text, TaskStatus t ){
        this.id = a;
        this.text = text;
        this.taskStatus = t;
    }
}
