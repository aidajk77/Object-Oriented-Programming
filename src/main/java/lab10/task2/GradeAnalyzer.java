package lab10.task2;

import java.util.ArrayList;

public class GradeAnalyzer {
    ArrayList<Integer> grades;
    public GradeAnalyzer(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public double calculateAverage(){
        double sum = 0;
        for(Integer i : grades){
            sum += i;
        }
        return sum/grades.size();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void printSummary(){
        for(Integer i : grades){
            System.out.print(i + " ");
        }
    }
}
