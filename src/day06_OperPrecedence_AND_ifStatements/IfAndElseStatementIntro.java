package day06_OperPrecedence_AND_ifStatements;

public class IfAndElseStatementIntro {

    public static void main(String[] args) {

        int age = 28;

        if(age >= 21){
            System.out.println("Eligible");
        }

        if(age < 21){
            System.out.println("Not Eligible");
        }
        System.out.println("-------------------------------------------");
        //More efficient way bec.in the previous one they are 2 individual statements & compiler has to check each 1 by
        //1. In the if & else compiler doesn't need to check the 2nd condition if the 1st condition is true

        if(age >= 21){
            System.out.println("Eligible");

        }else{ // otherwise
            System.out.println("Not Eligible");

        }
    }
}

