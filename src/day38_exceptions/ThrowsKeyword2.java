package day38_exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException {    //top1 so it has to use throws or try catch
    method1();                                                              //bec. it called method1(0 which has excep.

    }
    /*
     public static void pauseFor5Seconds(){        Every time when I call this () I want it to pause the execution
                                                   for 5 seconds so I can call the built in sleep() of Thread Class
    Thread.sleep(5000);                            But I have a checked exception now. So we have 2 solutions

    }
     */                                            //So if we decide to go with throws keyword to get rid of the checked
                                                   //now the responsibility to handle this excep. is the caller's.
    public static void pauseFor5Seconds() throws InterruptedException{   //If the caller is a part of the program which
        Thread.sleep(5000);                                        //isn't called a lot like the main() above then
                                                                         //throws kywrd is a good solution but if it is
    }                                                                    //smtg like a utility() which is frequently
                                                                         //called then to solve the issue permanently
                                                                         //with a try catch would be wiser so that the
                                                                         //callers don't need to deal with it.

    public static void method1() throws InterruptedException {           //when method1() calls pauseFor5Seconds() which
        System.out.println("Hello World");                               //has an except. which is not handled now needs
        pauseFor5Seconds();                                              //either handle or ignore it. Here we chose to
        System.out.println("Hello Cydeo");                               //ignore it with throws when main() calls
                                                                         //this method1() now main() has the excep.(top1)
    }                                                                    //the() that used throws gets rid of the excep.
                                                                         //by ignoring it but the caller has to deal with it
}                                                                        //if throws is used exit code is 0