package day09_scanner;

import java.util.Scanner;

public class DaysInWeek_switch {
    public static void main (String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int dayNumber=input.nextInt();

        String day="Invalid number";
        if (dayNumber>=1 && dayNumber<=7){
            switch (dayNumber){
                case 1: day="Mon";
                    break;
                case 2: day="Mon";
                    break;
                case 3: day="Mon";
                    break;
                case 4: day="Mon";
                    break;
                case 5: day="Mon";
                    break;
                case 6: day="Mon";
                    break;
                default: day="Mon";
                    break;
            }
        }

        System.out.println (day);
        input.close();
    }
}
//Bu benim yorumum-If you are using == to compare the #s then you can use switch