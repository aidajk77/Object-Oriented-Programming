package lab4.people;

public class Student extends Person{
    private int credits = 0;
    private int studentId;
    private int grade = 0;
    public Student(String name, String address){
        super(name,address);
    }
    public int getStudentId(){
        return this.studentId;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public int getGrade(){
        return this.grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int credits(){
        return this.credits;
    }
    public void study(){
        this.credits++;
    }
    public int addGrade(int grade){
        this.grade = this.grade + grade;
        return this.grade;
    }
    public String toString(){
        return super.toString() + "\n   Credits: " + this.credits;
    }
}
