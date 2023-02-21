package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args){

        Scanner input=new Scanner (System.in);        //If we'll use scanner object once then no need to store it into
                                                      //variable. Declaring variable is not necessary at all
        System.out.println("Enter the day number:");
                                           //We can directly call the () from the object new Scanner(System.in.nextInt()
                                           //and also assign it int num = new Scanner(System.in).nextInt();
                                           //Only if we'll use it once & if we go this way no need to close the scanner
        int numD = input.nextInt();

        String day = "Invalid";

        if (numD>=1 && numD<=7){

            day=(numD==1)? "Mon" :(numD==2)? "Tue" :(numD==3)? "Wed" :(numD==4)? "Thu" :(numD==5)? "Fri"
                    :(numD==6)?"Sat" :"Sun";

        }
        System.out.println(day);
        input.close();
    }
}
