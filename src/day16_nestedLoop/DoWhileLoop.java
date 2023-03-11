package day16_nestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        //In for loop if the condition is false "Hello..." won't be printed.  Will be printed 0 times!
        for (; condition ;){
            System.out.println("Hello Cydeo   --- For Loop");
        }
        System.out.println("-------------------------------------");

        //In while loop if the condition is false "Hello..." won't be printed.  Will be printed 0 times!
        while(condition){
            System.out.println("Hello Cydeo  --- While Loop");
        }

        System.out.println("-------------------------------------");

      //In do while loop if the condition is false "Hello..." won't be printed.  Will be printed 1 times!
        do{
            System.out.println("Hello Cydeo  --- Do&While Loop");
        }while (condition);

    }
}
