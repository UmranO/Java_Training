package day05_operaters;

public class ShorthandOperators {

    public static void main(String[] args) {

        int a = 20;

        System.out.println(a); //20

        System.out.println(a); //20

        a = 40;

        System.out.println(a);

        a = 90;

        System.out.println(a);

        System.out.println("------------------------------------------");

        double balance = 100;

        balance += 1000; // balance = 100 + 1000

        System.out.println("balance = " + balance);

        balance += 500; // balance= 1100 + 500

        System.out.println("balance = " + balance);

        balance += 10000;

        System.out.println("balance = " + balance);

        balance -= 1000;  // balance = 11600 - 1000

        System.out.println("balance = " + balance);

        balance -= 5000;

        System.out.println("balance = " + balance);


    }

}