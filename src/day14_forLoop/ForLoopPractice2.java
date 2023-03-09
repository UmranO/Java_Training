package day14_forLoop;
import java.util.Scanner;
public class ForLoopPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);                  //Scanner object should be created outside the loop

        int sum=0;                                               //Ask 5 # and display the sum
        for(int i=1; i<=5; i++) {

            System.out.println("Enter a number");
            sum+=input.nextInt();

        }
        System.out.println(sum);
        input.close();


        // write a program that can ask the user enter to enter a number for five times,  print the maximum number

        // write a program that can ask the user enter to enter a number for five times,  print the minimum number

    }
}