package lab7.task3;
import java.util.*;
import java.time.*;


public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        ArrayList<EmployeeRecord> employeeRecords = new ArrayList<>();
        EmployeeRecord e1 = new EmployeeRecord("e1", "Senior Developer",5000, LocalDate.of(2015, 10, 02));
        EmployeeRecord e2 = new EmployeeRecord("e2", "Junior Developer",2000, LocalDate.of(2022, 10, 02));
        employeeRecords.add(e1);
        employeeRecords.add(e2);
        ArrayList<EmployeeRecord> employeesWithWorkingOver5years = EmployeeRecord.filterEmployeeRecordsOverFiveYears(employeeRecords,currentDate);
        for (EmployeeRecord employee : employeesWithWorkingOver5years) {
            System.out.println(employee);
        }
        EmployeeRecord e3 = EmployeeRecord.createIntern("e3");
        employeeRecords.add(e3);
        double avgSalary = EmployeeRecord.avgSalary(employeeRecords);
        System.out.println(avgSalary);
        EmployeeRecord.printEmployeeRecordsOfDesiredPosition(employeeRecords,"Intern");
    }
}
