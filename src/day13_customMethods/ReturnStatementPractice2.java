package day13_customMethods;
import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        int number = new Scanner(System.in).nextInt();

//M---------------------------------------------------------------------------------------------------------

        if (number<=0 || number >7) {
            System.out.println("Invalid day");
            return;                                                             // exit the main method
        }
        System.out.println((number == 1) ? "M" : (number == 2) ? "T" : (number == 3) ? "W" : (number == 4) ?
                "Th" : (number == 5) ? "F" : (number == 6) ? "Sa" : "Su");



//UO--Practice----------------------------------------------------------------------------------------------
        System.out.println("Enter a number");
        int num = new Scanner(System.in).nextInt();
        
        boolean isValidU = num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7;

        if (!isValidU) {
            System.out.println("Invalid day");
            return;
        }
        System.out.println((num == 1) ? "M" : (num == 2) ? "T" : (num == 3) ? "W" : (num == 4) ? "Th" : (num == 5) ? "F"
                : (num == 6) ? "Sa" : "Su");

    }
}