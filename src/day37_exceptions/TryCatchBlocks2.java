package day37_exceptions;

public class TryCatchBlocks2 {
    public static void main(String[] args) {


        System.out.println("Program1 started");
        int[] arr = {1, 2, 3, 4};
            try{
                System.out.println(arr[1000]);
            } catch (RuntimeException e){                  //Parameter of the catch block. Runtime Exception is given as
                                                           //the Excep.type if we don't know the exact type of the excep.
                e.printStackTrace();                       //displays full details of the excep. AFTER the execution
            }                                              //of the the program
        System.out.println("Program1 ended");              //If the exception occurred in line 10 & isn't handled then
                                                           //it's impossible to print this line. So that's why we put
                                                           //" System.out.println(arr[1000]);" in try block & added a
                                                           //catch block

//You are not required to place any code fragments in the try & catch blocks other than the exception code fragments in
//the try block BUT if you don't you will not have any info about the excep. that might occurred at line 10 during the
//execution. So that's why it's recommended to use printStactTrace() or getMessage()s in the catch block

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Program2 started");
        try {
            System.out.println(9/0);
        }
        catch(RuntimeException e){
           //  e.printStackTrace();                     //Gives the full detail of the exception
            System.out.println(e.getMessage());         //It only gives us the exception message.--> / by zero

        }

        System.out.println("Program1 ended");
    }
}