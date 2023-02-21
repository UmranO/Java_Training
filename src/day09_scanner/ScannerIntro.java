package day09_scanner;

import java.util.Scanner;                             //To use the Scanner which comes from a diff. package in Java
                                                      //System Library. We have to import it.

public class ScannerIntro {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);         //this object is for reading user input only
        System.out.println("Enter a number: ");     //*
        byte num1=input.nextByte();                    //as soon as this method is called when this line11 gets executed
                                                       //it will start waiting the keyboard entry & whatever the user
                                                       //enters it will return it as byte at the end which we can assign
                                                       //it to a byte variable to make it reusable. If you don't store
                                                       //it to a variable you can't use this data again after line11

        System.out.println("You entered "+ num1);      //num1 is the container for the byte input that user provided

                                                       //After we run the program nothing is displayed in the console
                                                       //So to be more understandable the user we should display a
                                                    //* message telling the user she should enter a value

                                                        //Once you declare the scanner object you can use it as many
                                                        //times as you want by calling this reference name or the
                                                        //variable name that contains the scanner’s object.
        System.out.println("Enter your 1st Number:");
        byte byteNum=input.nextByte();

        System.out.println("Enter your 2nd Number:");
        short shortNum=input.nextShort();

        System.out.println("Enter your third number:");
        int num3 = input.nextInt();

        System.out.println("Enter your fourth number:");
        long num4 = input.nextLong();

        input.close();                                  //scanner is closed, can not read user inputs again


     /*
        System.out.println("Enter your fifth number:");

        int num5 = input.nextInt();                   Scanner is closed at line 27, once it's closed can not read inputs

     */
        System.out.println("First number: " + byteNum);
        System.out.println("Second number: " + shortNum);
        System.out.println("Third number: " + num3);
        System.out.println("Fourth number: " + num4);
      //System.out.println("Fifth number: " + num5);         since scanner is closed, can not read user inputs again

    }
}
