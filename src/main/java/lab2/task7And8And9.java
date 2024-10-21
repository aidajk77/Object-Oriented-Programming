package lab2;
import java.util.Scanner;

public class task7And8And9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        drawNumbersPiramid3(a);

    }
    public static void drawStarsPiramid(int a){
        for(int i=0;i<a+1;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void drawStarsPiramid2(int a){
        for(int i=a;i>-1;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void drawNumbersPiramid3(int a){
        for(int i=1;i<a+2;i++){
            for(int j=1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
