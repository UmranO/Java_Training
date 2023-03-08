package day13_customMethods;
import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        int month= new Scanner(System.in).nextInt();                         //We are calling the nextInt() from the
                                                                             //Scanner Object :new Scanner(System.in)
//M-------------------------------------------------------------------------------------------------------------------
        if(month<1 || month>12){                                             // if the month is invalid
            System.err.println("Invalid number for month");
            return;                                                          //terminates the main method
        }
        switch(month){                                                        //1 ~ 12
            case 2:
                System.out.println("28 days");
                break;
            case  4:case 6:case 9: case 11: System.out.println("30 days");
                break;
            default: System.out.println("31 days");                          //default is for months and can be used for
                                                                             //the remaining months.
        }



//UO-------------------------------------------------------------------------------------------------------------------
        System.out.println("Enter a number");
        if(month<1 || month>12){
            System.err.println("Invalid number for month");
            return;
        }
        System.out.println((month==1)?"Jan" :(month==2)?"Feb" :(month==3)?"Mar" :(month==4)? "Apr" :(month==5)?"May"
                :(month==6)?"Jun" :(month==7)?"Jul" :(month==8)?"Aug" :(month==9)?"S" :(month==10)?"Oct"
                :(month==11)?"Nov" :"Dec");

    }
}
//Yanlis anlayip boyle yapmisim M halbuki gun sayisini istiyormus