package day08_ternary_switch;

public class IfStatementAndTernariesPractice {
    public static void main(String[] args) {
        //mixing ternary with if outer if ->if subconditions are expressed with ternaries

        int scoreValue = 200;

        String resultGrade = "";

        if (scoreValue >= 0 && scoreValue <= 100) {                                  //precondition is expressed with if

     resultGrade=(scoreValue >= 90) ?"A" :(scoreValue >= 80)? "B" :(scoreValue >= 70)? "C" :(scoreValue >= 60)? "D":"F";

        }else{resultGrade="Invalid scoreValue";                                       //precondition's else block

        }
        System.out.println(resultGrade);

    }
}
