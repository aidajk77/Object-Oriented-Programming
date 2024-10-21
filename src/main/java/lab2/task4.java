package lab2;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first and last number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a++;
        while(a!=b){
            System.out.print(a+" ");
            a++;

        }
    }
}
