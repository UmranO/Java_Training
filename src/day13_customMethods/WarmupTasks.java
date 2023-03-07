package day13_customMethods;

import java.util.Scanner;

public class WarmupTasks {
    public static void main(String[] args) {

        calculateSwitch(1, 2, '!');

        calculateSwitch(1, 100, '-');

//        Scanner input=new Scanner (System.in);
//        System.out.println("Enter your two numbers and a math operator:");
//        double  n1 = input.nextDouble(),
//                n2 = input.nextDouble();
//        char operator = input.next().charAt(0);
//        input.close();
//        calculateSwitch(n1, n2, operator);

        ageGroupTernary(25);
    }

    //----Warmup 1--------------------------------------------------------------------------------------
    public static void calculateSwitch(double num1, double num2, char mathOperator) {

        switch (mathOperator) {

            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
                break;

            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
                break;

            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
                break;

            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
                break;

            default:
                System.err.println("Invalid operator: " + mathOperator);

        }
    }


//----Warmup 2--------------------------------------------------------------------------------------

    public static void ageGroupTernary(int age){

        if(age>=0 && age<=150){
        System.out.println((age<21)? "Teenager" :(age>=21 && age<55)? "Adult": "Senior"); //value that the ternary
                                                                                          //returns can be passed
                                                                                          //in the print statement
        }
        else{
            System.err.println("Invalid age "+age);
        }
    }



//----Warmup 3--------------------------------------------------------------------------------------
}





/*
Warmup task:
	1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid
	    math operator, otherwise the method prints "Invalid Operator"

	        Ex:
	            calculate(10, 20, '+')

	        output:
	            10 + 20 = 30


	2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )


    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote


 */