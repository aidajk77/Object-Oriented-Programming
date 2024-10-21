package lab2;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write numbers, if you want to exit type 0");
        int a=Integer.parseInt(reader.nextLine());
        int sum=0;
        while(a!=0){
            sum=sum+a;
            System.out.println("You wrote "+a+", and sum of all the number written is "+sum);
            a=Integer.parseInt(reader.nextLine());
        }
        System.out.println("Goodbye");
    }
}
