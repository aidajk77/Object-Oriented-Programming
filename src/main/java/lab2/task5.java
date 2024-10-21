package lab2;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int sum=0;
        for(int i=a;i>-1;i--){
            sum+=(int)Math.pow(2,i);
        }
        System.out.println("Sum is "+sum);


    }

}
