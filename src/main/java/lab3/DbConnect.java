package lab3;
import java.sql.*;
import java.util.*;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";

    private static Connection connection;

    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            System.out.println("Connected to database");
        } catch (SQLException e) {
            throw new RuntimeException("Not connected to database",e);
        }
    }
    public static List<String> getAllTasks(){
        List<String> tasks = new ArrayList<>();
        String query = "SELECT * FROM tasks";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                tasks.add(
                        resultSet.getInt("id") + " " +
                                resultSet.getString("task_description") + " " +
                                    resultSet.getString("task_status" ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return tasks;
    }
    public static String getTaskById(int id){
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String task = "";
        String query = "SELECT * FROM tasks WHERE id = ?";
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                // Extract the task details
                task = resultSet.getInt("id") + " " +
                        resultSet.getString("task_description") + " " +
                        resultSet.getString("task_status");
            } else {
                task = "Task not found for ID: " + id;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return task;

    }
    public static void insertTask(String taskDescription, String taskStatus){
        PreparedStatement statement = null;
        String query = "INSERT INTO tasks (task_description, task_status) VALUES (?, ?)";
        try {
            // Prepare the SQL statement
            statement = connection.prepareStatement(query);
            // Set the parameters for the query
            statement.setString(1, taskDescription);
            statement.setString(2, taskStatus);

            // Execute the update (since it's an INSERT, not a query)
            int rowsAffected = statement.executeUpdate();

            // Check if the insert was successful
            if (rowsAffected > 0) {
                System.out.println("Task added successfully.");
            } else {
                System.out.println("Task not added.");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error adding task", e);
        }
    }
    public static void updateTaskDescription(int id, String taskDescription){
        PreparedStatement statement = null;
        String query = "UPDATE tasks SET task_description = ? WHERE id = ?";
        try{
            statement = connection.prepareStatement(query);
            statement.setString(1,taskDescription);
            statement.setInt(2,id);
            int rowsAffected = statement.executeUpdate();
            if(rowsAffected > 0){
                System.out.println("Task updated successfully.");
            }
            else{
                System.out.println("Task not updated.");
            }
        }catch(SQLException e){
            System.out.println("Error updating task description");
        }

    }
}


