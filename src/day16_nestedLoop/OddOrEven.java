package day16_nestedLoop;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {                                         //to create an infinite loop

            System.out.println("Enter a number: ");            //we placed in the infinite loop to continue
            int number = input.nextInt();                      //to ask until the answer is no

            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }

            System.out.println("Would you like to enter another number?  Yes / No ");
            String answer = input.next().toLowerCase();

            while(!(answer.equals("yes")||answer.equals("no") )){   //while the user provides invalid answer
                System.err.println("Invalid answer! Would you like to enter another number?  Yes / No  ");
                answer = input.next().toLowerCase();
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for attending"); break;
            }
        }
    }
}

//we put the inner while loop bec if the user gives an answer other than Yes/No program still says
//Enter a number which is a bug. We should repeat "Would you like to enter another number?" over & over again
//until user gives Yes or No. For this I need a loop and the condition should be while the answer is invalid
//To give the invalid condition we give the valid condition in () & put ! in front of it while (!())