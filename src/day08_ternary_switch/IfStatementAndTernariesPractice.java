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


//-----All expressed with ternaries
        int value = 200;
        String g=(value >= 0 && value <= 100)?

                (value >= 90) ?"A" :(value >= 80)? "B" :(value >= 70)? "C" :(value >= 60)? "D":"F"

                :"Invalid Score";

        System.out.println(g);



    }
}
