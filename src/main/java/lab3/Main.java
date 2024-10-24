
package lab3;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        DbConnect dbInstance = new DbConnect();
        List<String> tasks = DbConnect.getAllTasks();
        System.out.println(DbConnect.getTaskById(1));
        DbConnect.insertTask("test", "TO DO" );
        tasks = DbConnect.getAllTasks();
        for(String task : tasks) {
            System.out.println(task);
        }
        DbConnect.updateTaskDescription(5,"updated");
        tasks = DbConnect.getAllTasks();
        for(String task : tasks) {
            System.out.println(task);
        }

    }
}
