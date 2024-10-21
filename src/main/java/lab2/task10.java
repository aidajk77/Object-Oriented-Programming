package lab2;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 55;
        System.out.println("Enter a number");
        int b = sc.nextInt();
        while(a!=b){
            if(a>b){
                System.out.println("Higher");
                b = sc.nextInt();
            }
            if(a<b){
                System.out.println("Lower");
                b = sc.nextInt();
            }
        }
        System.out.println("Bravo");
    }
}
