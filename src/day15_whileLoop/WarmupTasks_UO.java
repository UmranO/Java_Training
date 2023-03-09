package day15_whileLoop;
import java.util.Scanner;
public class WarmupTasks_UO {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        // write a program that can ask the user enter to enter a number for five times,  print the maximum number


        // write a program that can ask the user enter to enter a number for five times,  print the minimum number

        int max=-2147483648;                                             //Ask 5 # to the user and find the max of them
        int n1;

        for(int i=1; i<=5; i++) {
            System.out.println("Enter a number");
            n1=input.nextInt();
            max=(n1>max)? n1 :max;

        }
        System.out.println(max);


        int min=2147483647;
        int n2;

        for(int i=1; i<=5; i++){
            System.out.println("Enter another number");
            n2=input.nextInt();
            min=(n2<min)? n2 :min;
        }
        System.out.println(min);
        input.close();
    }
}
