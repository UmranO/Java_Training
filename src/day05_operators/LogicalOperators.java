package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 60000;
        int creditScore = 650;
        int age = 42;

        boolean eligibleForLoan =   salary >= 30000 && creditScore >= 650 && age >= 18;
        //  true        &&     true            &&   true

        System.out.println(eligibleForLoan);

        System.out.println("-----------------------------------------------------");

        age = 18;
        String country = "USA";

        boolean eligibleToVote = age >= 18  && country == "USA";
        //                          true    &&  false

        System.out.println(eligibleToVote);


    }

}
