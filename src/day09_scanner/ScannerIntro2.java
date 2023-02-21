package day09_scanner;

import java.util.Scanner;
public class ScannerIntro2 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first decimal number:");
        float f=input.nextFloat();

        System.out.println("Enter your second decimal number:");
        double d = input.nextDouble();

        System.out.println("Enter true or false:");
        boolean b = input.nextBoolean();

        System.out.println("First decimal # is: "+ f);
        System.out.println("Second decimal number: "+ d);
        System.out.println("b :" +b );

        input.close();
    }
}
