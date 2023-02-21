package day09_scanner;

import java.util.Scanner;
public class ScannerIntro2 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first decimal number:");  //Since it will be implicitly casted we can give
        float f=input.nextFloat();                               //integer instead of float or double but at the end
                                                                 //we'll get a decimal #
        System.out.println("Enter your second decimal number:"); //Since it will be implicitly casted we can give
        double d = input.nextDouble();                           //integer instead of float or double but at the end
                                                                 //we'll get a decimal #
        System.out.println("Enter true or false:");
        boolean b = input.nextBoolean();

        System.out.println("First decimal # is: "+ f);
        System.out.println("Second decimal number: "+ d);
        System.out.println("b :" +b );

        input.close();
    }
}
