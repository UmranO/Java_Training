package day12_customMethods;

public class CustomMethodsPractice {
    public static void main(String[] args){
        System.out.println("---------------------------------------------------------");
        eligibleAlcohol(19);

        System.out.println("---------------------------------------------------------");
        posNegOrZero(4);

        System.out.println("---------------------------------------------------------");
        CalculateGrade(95);

        System.out.println("---------------------------------------------------------");
        maxNum(100,5);

        System.out.println("---------------------------------------------------------");
        initials("Umran","Ozman");

    }


    // create a method that can check if a person is eligible to buy alcohol  (age)

    public static void eligibleAlcohol(int age) {

        if (age >= 21) System.out.println("Eligible to buy Alchol");
        else System.out.println("Not Eligible to buy Alchol");
    }

    //--create a method that can check if a number is positive, or negative or zero (number)---------------
    public static void posNegOrZero(int number){
        String result="";
        if (number>0) result="Positive";
        else if (number<0) result="Negative";
        else result="Zero";
        System.out.println(number + " is " + result);
    }

    //--create a method that can calculate the grade of the students  (score)------------------------------
    public static void CalculateGrade(int score){
        String grade=(score>=90)? "A" :(score>=80 )? "B" :(score>=70)? "C" :(score>=60)? "D" :"F";
        System.out.println("The grade is: " + grade);
    }
//--create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)

        public static void maxNum(int num1, int num2){

            if(num1>num2) System.out.println(num1 + " is the max #");
            else if(num2>num1) System.out.println(num2 + " is the max #");
            else System.out.println("They are equal");

        }
        //Create a method that can display the initials of a person  (firstName, lastName)---------------------
        /*
        firstname = "Cydeo"
        lastname = "School"
        initial ==> C.S
         */

        public static void initials(String firstName, String lastName){

            String initials=firstName.charAt(0)+"."+lastName.charAt(0);
            System.out.println("Initials of your name: "+ initials);

        }


}
