package day09_scanner;

import java.util.Scanner;

public class OddOrEven_Scanner { public static void main(String[] args){

    System.out.println("Enter a number");
    int numberOOE= new Scanner(System.in).nextInt();
    String numB=(numberOOE%2==0)? "The number is Even" :"The number is Odd";
    System.out.println(numB);


}
}
/*Tasks:
        1. Odd or Even number
        1.1 Ask the user to enter a number
        1.2 determine if the number is odd or even

 */