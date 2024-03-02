package day38_exceptions;

public class ThrowsKeyword {
    public static void main(String[] args){

        System.out.println("Program1 started");

        // System.out.println(100/0);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------");


    }

}
