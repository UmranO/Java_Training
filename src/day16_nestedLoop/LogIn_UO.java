package day16_nestedLoop;
import java.util.Scanner;
public class LogIn_UO {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String u, p;

        do {
            System.out.println("Enter your username");
            u = input.next();
            System.out.println("Enter your password");
            p = input.next();

            if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                System.out.println("You are logged in");
            } else {
                for (int i = 1; i <= 3; i++) {
                    if (i == 3) {
                        System.err.println("This is your last chance.Incorrect credentials");
                    }
                    System.err.println("Incorrect credentials. Enter your username");
                    u = input.next();
                    System.err.println("Incorrect credentials. Enter your password");
                    p = input.next();
                    if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                        System.out.println("You are logged in");
                        break;
                    }
                }
                if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                    System.err.println("Your acct is locked. Contact support!");
                    return;}                                //Bu return sart cunku yoksa devam ediyor
                }                                           //
        }
                while (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) ;


        input.close();
    }
    }

    //Kendm denedim ama %100 emin degilim