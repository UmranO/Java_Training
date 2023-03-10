package day13_customMethods;

public class ReturnStatement {
    public static void main(String[] args) {
        /*
        1-	Return a value from the return method.   (This is a must not optional! )
        2-	To exit the method- it can exit from any method not only return method but also it can also be void method
        return stamet can be used to exit any method
         */

        eligible(156);
        System.out.println("-----------------------------------------------------");

        System.out.println("Test1 started");
        boolean exit=true;
        if(exit){
            return;}                                           //main() gets terminated after this line is executed
        System.out.println("Test1 Completed");
        System.out.println("Test2 started");
    }


    public static void eligible(int age){
        if (age<0 || age>150){
            System.err.println("Invalid age " + age);
            return;                                            //return st. is used for exiting the method in a void ()
                                                               //After the previous line(line 16) eligible() is
        }                                                      //terminated bec. age is invalid

        if (age>=21) System.out.println("You are eligible to buy alcohol");
        else {System.out.println("You are not eligible to buy alcohol");}
    }

    public static int multiplication(int n1, int n2){          //Here return statement is used for returning a value
                                                               //If it is return() NOT void you should return a value
                                                               //returns the value when exiting the method
        int result=n1*n2;
        return result;
    }

}
