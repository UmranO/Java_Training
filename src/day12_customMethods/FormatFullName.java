package day12_customMethods;
import java.util.Locale;
import java.util.Scanner;
public class FormatFullName {
    public static void main(String[] args){
  //UO-----------------------------------------------------------------------------------------------------------------
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your name");
        String name=input.nextLine().toLowerCase();
        System.out.println("Enter your  last name");
        String lastName=input.nextLine().toLowerCase();

        System.out.println(name.replace((name.charAt(0)+""),(name.charAt(0)+"").toUpperCase())+" "
                +(lastName.replace((lastName.charAt(0)+""),(lastName.charAt(0)+"").toUpperCase())));

  //M-----------------------------------------------------------------------------------------------------------------

        //--Without Scanner----------------------
        String first="jAva";
        String last="SCHOOL";

        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        //getting first character of first name  +  the remaining characters of the first name

        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

        String full_name = first + " " + last;

        System.out.println(full_name);







    }

}

/*
1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */