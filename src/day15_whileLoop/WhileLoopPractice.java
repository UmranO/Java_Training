package day15_whileLoop;
import java.util.Scanner;
public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your age");
        int age=input.nextInt();

        //If it is not a valid entry repeat "Enter your age" over & over untill the user provides a valid entry

        while( ! (age >=1 && age <= 150) ){                                         //while the age is invalid
            System.out.println("Invalid entry! Please re-enter your age:");         //should repeat asking &
            age = input.nextInt();                                                  //should repeat reassigning
        }
                                                                                    //If a valid entry then the
        if(age >= 21){                                                              //following codes should be executed
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        input.close();

    }
}

/*
//        int age=input.nextInt();
//
//        if (age>21){
//            System.out.println("Elligible");
//        }else System.out.println("Not elligible");

 */