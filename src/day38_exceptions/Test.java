package day38_exceptions;
import utilities.Library;
public class Test {
    public static  void main(String[] args){
        System.out.println("Hello World");

        //Thread.sleep(3500);                     //Built in sleep() from Thread Class-we have to give the argument in
                                                  //milliseconds + it will give us a checked exception so instead we can
        Library.sleep(5.0);                 //use our custom() from Library Class/utilities so that we can give
                                                  //the argument in seconds and the checked excep. is already handled
        System.out.println("Hello Cydeo");
    }
}