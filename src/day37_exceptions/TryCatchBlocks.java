package day37_exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program1 started");

        try {

            System.out.println(9 / 0); // Arithmetic Exception

            System.out.println("Try block");

        } catch (ArithmeticException e) {

            System.out.println("Catch Block");

        }
        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Program2 started");

        String str = null;

        try {                                                 //We put the code fragment with the potential exception
            System.out.println(str.toLowerCase());            //source in the try block. If it is solved exception will
            System.out.println("Try Block");                  //be gone and no need for the catch block but if not
        }                                                     //if we give a correct exception class as the reference
        catch (RuntimeException e){                           //type the exception object will cathch it and handle it.
            System.out.println("Catch Block");
        }


    }
}