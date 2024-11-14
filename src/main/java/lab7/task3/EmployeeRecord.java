package lab7.task3;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public record EmployeeRecord(String name, String position, int salary, LocalDate employmenDate) {
    public static final String DEFAULT_POSITION = "Intern";
    public EmployeeRecord(String name, String position, int salary) {
        this(name, position, salary, LocalDate.now());
    }
    public static EmployeeRecord createIntern(String name){
        return new EmployeeRecord(name, DEFAULT_POSITION, 500);
    }
    public static ArrayList<EmployeeRecord> filterEmployeeRecordsOverFiveYears(ArrayList<EmployeeRecord> employeeRecords,LocalDate currentDate){
        ArrayList<EmployeeRecord> filteredEmployeeRecords = new ArrayList<>();
        for(EmployeeRecord employeeRecord : employeeRecords){
            Period period=Period.between(employeeRecord.employmenDate,currentDate);
            if(period.getYears()>5){
                filteredEmployeeRecords.add(employeeRecord);
            }
        }
        return filteredEmployeeRecords;
    }

    public static double avgSalary(ArrayList<EmployeeRecord> employeeRecords){
        double sum = 0;
        for(EmployeeRecord employeeRecord : employeeRecords){
            sum+=employeeRecord.salary;
        }
        return sum/employeeRecords.size();
    }

    public static void printEmployeeRecordsOfDesiredPosition(ArrayList<EmployeeRecord> employeeRecords, String desiredPosition){
        for(EmployeeRecord employeeRecord : employeeRecords){
            if(employeeRecord.position.equals(desiredPosition)){
                System.out.println(employeeRecord);
            }
        }
    }
}


