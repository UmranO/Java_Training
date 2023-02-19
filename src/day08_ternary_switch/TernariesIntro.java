package day08_ternary_switch;

public class TernariesIntro {
    public static void main(String[] args){

        int score = 85;
        String result2;

        if(score >= 60){
            result2 = "Passed";
        }else {
            result2 = "Failed";
        }

        System.out.println(result2);

        System.out.println("-Ternary Version-------------------------------------");

        String result3=(score>=60)? "Passed" : "Failed";
        System.out.println(result3);

        System.out.println("------------------------------------------------------------------");

        int age = 34;

        /*
        String r;
        if(age >= 21){
            r = "Eligible";
        }else{
            r = "Not eligible";
        }
    */

        String result4 = (age>=21)? "Elligible" : "Not Elligible";

        System.out.println(result4);

    }
}
