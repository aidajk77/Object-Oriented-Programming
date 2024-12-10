package lab11.task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentSystem {
    private List<Student> students;
    public StudentSystem(String fileName) {
        students = new ArrayList<Student>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<String> lines = reader.lines().toList();
            for(String line : lines) {
                String[] parts = line.split(",");
                students.add(new Student(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        parts[2],
                        parts[3],
                        Double.parseDouble(parts[4])
                ));
            }
            validateStudentData(students);
        }catch(IOException e){
            System.out.println("No such file");
        }catch(InvalidStudentDataException e){
        }
    }
    public StudentSystem(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public static List<Student> readStudents(String fileName) {
        StudentSystem studentSystem = new StudentSystem(fileName);
        return studentSystem.getStudents();
    }

    public int noOfStudents() {
        return students.size();
    }
    public Optional<Student> getStudentByID(int id) {
        for(Student student : students) {
            if(student.getId() == id) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public Student getHighestGPAStudent(){
        if(this.students.size() == 0) {
            throw new EmptyStudentListException("List of students is empty");
        }
        Student highestGPAStudent = this.students.get(0);
        for(Student student : students) {
            if(student.getGpa() > highestGPAStudent.getGpa()) {
                highestGPAStudent = student;
            }
        }
        return highestGPAStudent;
    }

    public Student getLongestNameStudent() {
        if(this.students.size() == 0) {
            throw new EmptyStudentListException("List of students is empty");
        }
        Student longestNameStudent = this.students.get(0);
        for(Student student : students) {
            if(student.getName().length() > longestNameStudent.getName().length()) {
                longestNameStudent = student;
            }
        }
        return longestNameStudent;
    }

    private void validateStudentData(List<Student> students) throws InvalidStudentDataException {
        for(Student student : students) {
            if(student.getGpa()<6 && student.getGpa()>10) {
                throw new InvalidStudentDataException("Read data has invalid rows");
            }
        }
    }
}
