package day16_nestedLoop;
import java.util.Scanner;
public class Calculator_UO {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        while(true) {
        System.out.println("Enter your first number");
        double num1=input.nextDouble();
            System.out.println("Enter a math operator");
            char oper = input.next().charAt(0);
            while (!(oper == '+' || oper == '-' || oper == '/' || oper == '*')) {  //while the operator is invalid
                System.err.println("Invalid entry! Enter a math operator");
                oper = input.next().charAt(0);
            }
            System.out.println("Enter your 2nd number: ");
            double num2 = input.nextDouble();

            System.out.println((oper == '+') ? num1 + num2 : (oper == '-') ? num1 - num2 :
                               (oper == '/') ? num1 / num2 : num1 * num2);

            System.out.println("Would you like to continue? (Yes/No)");
            String answer = input.next();
            while (!(answer.equalsIgnoreCase("Yes")|| answer.equalsIgnoreCase("No"))){
                System.err.println("Invalid answer. Would you like to continue? (Yes/No)");
                answer=input.next();
            }
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("Thank you");
                break;
            }
        }
     input.close();
    }

}
/*
1. Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, repeat the same step until user enters a valid operator
			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No) If the user enters invalid answer, repeat the same step until user
			    enters a valid answer



 */
