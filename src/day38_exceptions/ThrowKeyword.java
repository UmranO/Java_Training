package day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");

        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150) {                                                                     //precondition
            if (age < 0) {
                throw new InputMismatchException("Age of the person should not be negative: " + age);
            } else {
                throw new InputMismatchException("Age of the person can not be greater than 150: " + age);
            }
        }

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        System.out.println("-----------------------------------------------------------");

        // throw new RuntimeException("Runtime exception");  Even though this is an unchecked exception compiler knows
        // System.out.println("Hello World");                that line31 will give an exception so line 32 becomes
                                                             //unreachable

        //We can also throw checked exceptions BUT mantikli degil since it requires immediate handling.

        //throw new FileNotFoundException(""); So ifg we decide to handle it with try catch:

        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------------------------------------------------");
        }
    }

