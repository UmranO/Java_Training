package day15_whileLoop;
import java.util.Scanner;
public class MinimumNumber {
    public static void main(String[] args) {

//write a program that can ask the user enter to enter a number for five times,  print the minimum number
        Scanner input = new Scanner(System.in);

        int min = 2147483647;                  //Any integer number that user enters will ALWAYS be less than 2147483647

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number:");
            int num = input.nextInt();   // 20, 30, -5, 100, 200

            if (num < min) {                  //if the user entered entry is less than the current minimum number that
                min = num;                    //we have then user entered number should be the minimum number
            }
        }
        System.out.println("Minimum number is: " + min);
        input.close();
    }
}