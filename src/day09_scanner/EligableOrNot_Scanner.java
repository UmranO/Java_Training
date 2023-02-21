package day09_scanner;

import java.util.Scanner;

public class EligableOrNot_Scanner {public static void main(String[] args){

    Scanner input=new Scanner (System.in);

    System.out.println("Enter your age: ");
    byte ageS=input.nextByte();
    String eligabilty=(ageS>=21)? "Eligable" :"Not Eligable";
    System.out.println(eligabilty);

    input.close();

}
}
/*

2. Eligible or not Eligible to buy alcohol
        2.1 Ask the user to enter his/her age
        2.2 write a program that can check if the person eligible to buy alcohol
 */