package day37_exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program1 started");

        try {

            System.out.println(9 / 0); // Arithmetic Exception

            System.out.println("Try block");

        }catch(ArithmeticException e){

            System.out.println("Catch Block");

        }

    }
