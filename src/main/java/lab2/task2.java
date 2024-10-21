package lab2;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=Integer.parseInt(reader.nextLine());
        int b=Integer.parseInt(reader.nextLine());
        int c=Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the given three numbers is "+(a+b+c));

    }
}
