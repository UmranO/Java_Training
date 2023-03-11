package day16_nestedLoop;
import java.util.Scanner;
public class OddOrEven_UO {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number");

        while(true) {

            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is an even number");
            } else System.out.println(num + " is an odd number");

            System.out.println("Do you like to enter another number? Y/N");
            String answer=input.next();
            while (!(answer.equals("Y") || answer.equals("N"))) {
                System.out.println("Invalid entry. Do you like to enter another number? Y/N ");
                answer=input.next();
            }

            if (answer.equals("Y")) {System.out.println("Enter a number");}
            else {
                System.out.println("Thank you for attending"); return;
            };

        }
}
//if the answer is Y all the steps above including
//this line should be repeated inside a loop
}
//create a prog. to identify if # is odd or even & display the result where input is received from user
//ask the user if she want to give another # if yes continue