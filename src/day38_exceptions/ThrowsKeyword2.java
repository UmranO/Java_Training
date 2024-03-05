package day38_exceptions;
import utilities.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {

//    public static void main(String[] args) throws InterruptedException {    top1 so it has to use throws or try catch
//        method1();                      }                                    bec. it called method1 which has excep.
        public static void main(String[] args)   {                          //yukardaki throws'u gostermek icindi
        Library.sleep(3.5);                                  //bizim sleep method (o try catch'le handle ettigi
    }                                                                //icin burda excep. vermiyor )

    /*
     public static void pauseFor5Seconds(){        Every time when I call this () I want it to pause the execution
                                                   for 5 seconds so I can call the built in sleep() of Thread Class
    Thread.sleep(5000);                            But I have a checked exception now. So we have 2 solutions

    }
     */                                            //So if we decide to go with throws keyword to get rid of the checked
                                                   //now the responsibility to handle this excep. is the caller's.
    public static void pauseFor5Seconds() throws InterruptedException {  //If the caller is a part of the program which
        Thread.sleep(5000);                                        //isn't called a lot like the main() above then
                                                                         //throws kywrd is a good solution but if it is
    }                                                                    //smtg like a utility() which is frequently
                                                                         //called then to solve the issue permanently
                                                                         //with a try catch would be wiser so that the
                                                                         //callers don't need to deal with it.

    public static void method1() throws InterruptedException {       //when method1() calls pauseFor5Seconds() which
        System.out.println("Hello World");                           //has an except. which is not handled now needs
        pauseFor5Seconds();                                          //either handle or ignore it. Here we chose to
        System.out.println("Hello Cydeo");                           //ignore it with throws when main() calls
                                                                     //this method1() now main() has the excep.(top1)
    }                                                                //the() that used throws gets rid of the excep.
                                                                     //by ignoring it but the caller has to deal with it
                                                                     //if throws is used exit code is 0
//---------------------------------------------------------------------------------------------------------------------
//If we are to create a utility method which might be called frequently and which may accept seconds as argument
//instead of milliseconds : we created in the utilities package in the Library class (below)
    /*
    try {Thread.sleep( (long)(seconds * 1000L) );}
    catch (InterruptedException e) {throw new RuntimeException(e); }
     */
//---------------------------------------------------------------------------------------------------------------------
//Suppose there is this method2:  public static void method2()
//below & we won't call this method at anywhere else and this method has multiple checkede xceptions So in this case
//how can we get rid of all those checked exceptions that are giving me all those compile errors? -either handle them 1
//by 1 or by using throws keyword: In case of many same type Exceptions you can pass the parent Exception which is in
//this case Exception but since it's a checked excep. & we know the types we can give multiple Excep. Classes together
//throws keyword. Rule Parent Exception Class should not be placed before children:

   public static void method2() throws InterruptedException, FileNotFoundException {
       Thread.sleep(3000);                                  //Checked Exception
       System.out.println("First program ended");
       new FileInputStream(" ");                            //Checked Exception
       Thread.sleep(5000);                                  //Checked Exception
   }

}