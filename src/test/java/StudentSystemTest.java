import lab11.task.Student;
import lab11.task.StudentSystem;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class StudentSystemTest {
    @Test
    public void testifStudentisPresent(){
        StudentSystem ss = new StudentSystem("C:\\Users\\Korisnik\\Downloads\\students.csv");
        assertNotEquals(0,ss.noOfStudents(),"At least one student should be present");
    }
    @Test
    public void testStudentWithId100(){
        StudentSystem ss = new StudentSystem("C:\\Users\\Korisnik\\Downloads\\students.csv");
        assertFalse(ss.getStudentByID(100).isPresent());
    }
    @Test
    public void testHighestGPAStudent(){
        StudentSystem ss = new StudentSystem("C:\\Users\\Korisnik\\Downloads\\students.csv");
        assertEquals(9.8,ss.getHighestGPAStudent().getGpa(),"Student with the highest gpa should be with 9.8");
    }
    @Test
    public void testExceptionForEmptyStudentList(){
        StudentSystem ss = new StudentSystem("empty.csv");
        assertThrows(Exception.class,() -> {
            ss.getHighestGPAStudent();
        });
    }
    @Test
    public void testExceptionMessageForEmptyStudentList(){
        StudentSystem ss = new StudentSystem(new ArrayList<>());
        Exception exception = assertThrows(Exception.class,() -> {
            ss.getHighestGPAStudent();
        });
        String message = exception.getMessage();
        assertEquals(message,"List of students is empty.");
    }
    @Test
    public void testNamesArray(){
        List<String> expectedNames = List.of(
                "Camila Wood",
                "Alexander Thompson",
                "Liam Taylor",
                "Evelyn Jenkins",
                "Michael Jackson"
        );
        List<Student> students = StudentSystem.readStudents("C:\\Users\\Korisnik\\Downloads\\students.csv");
        List<String> actualNames = students.stream()
                .map(Student::getName)
                .limit(5)
                .collect(Collectors.toList());
        assertEquals(expectedNames,actualNames,"First five students should be: Camila Wood, Alexander Thompson, Liam Taylor, Evelyn Jenkins, Michael Jackson.");

    }
    @Test
    public void testSameStudent(){
        StudentSystem ss = new StudentSystem("C:\\Users\\Korisnik\\Downloads\\students.csv");
        assertEquals(12,ss.getHighestGPAStudent().getId(),"Student with the highest gpa should have ID 12");
    }

}
