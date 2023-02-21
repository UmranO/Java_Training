package day09_scanner;

import java.util.Scanner;
public class MonthName_Scanner {
    public static void main(String[] args){

        System.out.println("Enter a number");
        int numM=new Scanner(System.in).nextInt();

        String monthName= (numM>=1 && numM<=12)?
                (numM==1)?"Jan" :(numM==2)? "Feb" :(numM==3)? "Mar":(numM==4)? "Mar" :(numM==5)? "May"
                        :(numM==6)? "Jun" :(numM==7)? "Jul":(numM==8)? "Aug" :(numM==9)? "Sep"
                        :(numM==10)? "Oct" :(numM==11)? "Nov" :"Dec"
                            :"Invalid number";

        System.out.println(monthName);
    }
}
/*
        3. MonthName
        3.1 Ask the user to enter a number
        3.2 Display the month name
 */