package day37_exceptions;

        public class FinallyBlock {

            public static void main(String[] args) {

                try{
                    System.out.println( 9 /0 );
                }catch (RuntimeException e){
                    System.out.println("Runtime Exception has been caught");
                    e.printStackTrace();
                    //   System.exit(1);
                }finally {
                    System.out.println("Finally Block");
                }

            }

        }
//Finally Block is always executed weather the exception is caught or not unless exit() is called in the catch block.
//In fact there is n't a logic to call exit() since we are using the finally block to be sure that specific codes in it
// are certainly be executed.
//If it is caught the exit code is 0 if not caught exit code will be 1