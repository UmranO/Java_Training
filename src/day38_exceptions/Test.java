package day38_exceptions;
import utilities.Library;

import java.time.LocalTime;


public class Test {
    public static  void main(String[] args){

        System.out.println("UO's-----------------------------");

        System.out.println("Hello World");

        //Thread.sleep(3500);                     //Built in sleep() from Thread Class-we have to give the argument in
                                                  //milliseconds + it will give us a checked exception so instead we can
        Library.sleep(5.0);               //use our custom() from Library Class/utilities so that we can give
                                                  //the argument in seconds and the checked excep. is already handled
        System.out.println("Hello Cydeo");

        System.out.println("M's-----------------------------");

        System.out.println("Hello Cydeo");

        // Thread.sleep(3500);
        Library.sleep(3.5);

        System.out.println("How are you today?");

        System.out.println("--------------------------------------------------------------------------");

        if(LocalTime.now().equals(LocalTime.of(4,0))){     //Application of our unchecked Exception called
            throw new BreakTimeException();                             //BreakTimeException
        }

    }

}
