package day37_exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

System.out.println("----Unchecked Exception (RunTime)----------------------------------------------------------------");
        System.out.println("Program1 started");

        try {

            System.out.println(9 / 0);                        //will result in Arithmetic Exception-so we put the code
                                                              //potential exception in the try block
            System.out.println("Try block");                  //try block can 't be an independent block

        } catch (ArithmeticException e) {                     //So we give the catch block as well.When we create the
                                                              //catch block we need to pass a parameter so that the
            System.out.println("Catch Block");                //in case of an excep.the excep.object can be passed to
                                                              //the catch block.
        }
        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Program2 started");

        String str = null;
                                                              //It will result in NullPointerException
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
        System.out.println("Program3 ended");              //It prints 5 seconds later than it prints Try Block

    }
}