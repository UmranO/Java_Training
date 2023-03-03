package day12_customMethods;

public class Test {

    public static void main(String[] args) {

        int number = 300;

        CustomMethodsWithParameter.oddOrEven(300);    //This custom () oddOrEven is created in
                                                              //CustomMethodsWithParameter Class

        String firstName = "Vasyl",
                lastName = "Dobrianski";

        CustomMethodsPractice.initials(firstName, lastName);


    }

}
