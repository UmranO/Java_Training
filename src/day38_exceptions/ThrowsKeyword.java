package day38_exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
         /*
        System.out.println("Program1 started");

       // System.out.println(100/0);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------");

        System.out.println("Program2 started");

        // System.out.println(100/0);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }                                            If you need to use code Thread.sleep(5000); in may different places
                                                     & you have to continue to use try catch to handle it but your code
        System.out.println("Program2 ended");        will be  long and won't look clean
        */                                      //If I am not going to call this main() anywhere now & I'll only use it
                                                //within this class only. In this scenario if I need to use this sleep()
                                                //in many places in my program.
        System.out.println("Program1 started");

        Thread.sleep(5000);                //<-here

        System.out.println("Program1 ended");

        System.out.println("--------------------------------------");

        System.out.println("Program2 started");

        Thread.sleep(5000);                //<-here

        System.out.println("Program2 ended");

        System.out.println("--------------------------------------");

        System.out.println("Program3 started");

  //FileInputStream file = new FileInputStream("");    (Okumak istedigimiz dosyanin path'i yazilmali-Burada yazmadigimiz
                                                          // icin FileNotFoundException verecegi icin commented out)


        Thread.sleep(5000);               //<-here  3 times-Instead of giving 3 try catch blocks then we can
                                                //use the throws keyword in the main()'s signature to fix all of them
        System.out.println("Program3 ended");   //Interrupted exception which is a checked excep.is the potential excep.
                                                //that might be thrown when we use the sleep() & checked excep. requires
                                                //immediate attention. Otherwise it won't run. throws keyword is the
                                                //fastest way to get rid of them. If you are sure that you'll use the ()
                                                //that has throws keyword won't be called and used in this class then
                                                //it's the best option. Advantage of throws is code is shorter & faster



    }

}
