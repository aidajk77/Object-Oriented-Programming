package lab11.task;

public class Main {
    public static void main(String[] args) {
        StudentSystem ss = new StudentSystem("C:\\Users\\Korisnik\\Downloads\\students.csv");
        for(Student s : ss.getStudents()){
            System.out.println(s);
        }
        System.out.println("________________________");
        System.out.println(ss.getHighestGPAStudent());
        System.out.println(ss.getLongestNameStudent());
        if(ss.getStudentByID(1).isPresent()){
            System.out.println(ss.getStudentByID(1).get());
        }
        System.out.println(ss.noOfStudents());

    }
}
