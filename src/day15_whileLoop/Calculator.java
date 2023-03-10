package day15_whileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = input.nextDouble();

        System.out.println("Enter a math operator: ");
        char operator = input.next().charAt(0);
                                                                                       //while the operator is invalid
        while (  ! (operator == '+' || operator == '-' || operator == '*' || operator == '/') ){

            System.err.println("Invalid Operator! Please re-enter the math operator"); //When this message is displayed
            operator = input.next().charAt(0);                                         //user should able to provide the
                                                                                       //operator so we use next() to
                                                                                       //get the input again

        }

        if(operator == '+'){
            System.out.println(num1 + num2);
        }else if(operator == '-'){
            System.out.println(num1  - num2);
        }else if(operator == '*'){
            System.out.println(num1 * num2);
        }else{ // /
            System.out.println(num1 / num2);
        }

        input.close();

    }

}