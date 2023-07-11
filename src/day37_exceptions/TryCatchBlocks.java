package day37_exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

System.out.println("----Unchecked Exception (RunTime)----------------------------------------------------------------");
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
                                                              //NullPointerException
        try {                                                 //We put the code fragment with the potential exception
            System.out.println(str.toLowerCase());            //source in the try block. If it is solved exception will
            System.out.println("Try Block");                  //be gone and no need for the catch block but if not
        }                                                     //if we give a correct exception class as the reference
        catch (RuntimeException e){                           //type the exception object will catch it and handle it.
            System.out.println("Catch Block");
        }
        System.out.println("Program2 ended");

        System.out.println("----Checked Exception (CompileTime)--------------------------------------------------------------");

        System.out.println("Program3 started");

        try {
            Thread.sleep(5000);
            System.out.println("Try Block");

        }catch (InterruptedException e){
            System.out.println("Catch Block");
        }
        System.out.println("Program3 ended");

    }
}