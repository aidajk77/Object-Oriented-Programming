package lab10.task2;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Integer> grades;
    public Student(int id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void printInfo(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.print("Student Grades: ");
        for (Integer grade : grades) {
            System.out.print(grade+" ");
        }
    }
}
