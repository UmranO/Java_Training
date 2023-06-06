package day16_nestedLoop;
import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u, p;
        int attempt = 3;                                                    //This can be added to limit the #of attemps
        //for loop is better for this - demo purpose
        do{
            System.out.println("Enter your user name:");                    //These statements in do block will be
            u = input.next();                                               //checked before checking the condition

            System.out.println("Enter your password");                      //These statements in do block will be
            p = input.next();                                               //checked before checking the condition

            attempt--;                                                      //This can be added to limit the #of attemps

            if(attempt == 0){                                               //This is where we stop the loop
                break;
            }

        }while( !(u.equals("Cydeo") && p.equals("WoodenSpoon")) );           //while the credentials are invalid
        //DO BLOCK WILL CONTINUE TO BE EXECUTED




    }

}