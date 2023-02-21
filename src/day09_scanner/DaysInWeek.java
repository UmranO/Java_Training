package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args){

        Scanner input=new Scanner (System.in);
        System.out.println("Enter the day number:");
        //int num = new Scanner(System.in).nextInt();
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
