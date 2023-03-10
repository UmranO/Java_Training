package day15_whileLoop;
import java.util.Scanner;

public class Calculator_UO {
    public static void main (String [] args){
        //Ask user 1st & 2nd # & math operator then Calculate

        Scanner input=new Scanner (System.in);

        System.out.println("Enter your first number");
        double num = input.nextDouble();

        System.out.println("Enter your second number");
        double num1 = input.nextDouble();

        System.out.println("Enter a math operator");
        char operator =input.next().charAt(0);                                              //to get char out of String


        while(!(operator=='+'||operator=='-'||operator=='/'||operator=='*'))
        {System.err.println("Invalid operator! Enter an operator");}

        double result=0;

        switch (operator){
            case '+' : result=num+num1;
                break;
            case '-' : result=num-num1;
                break;
            case '/' : result=num/num1;
                break;
            default  : result=num*num1;
        }
        System.out.println(result);

    }
}
