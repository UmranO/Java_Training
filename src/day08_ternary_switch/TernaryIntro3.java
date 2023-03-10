package day08_ternary_switch;

public class TernaryIntro3 {
    public static void main (String[] args){
        int score = 130;

        /*
        String res = "";
        if(score >= 0 && score <= 100){
            if(score >= 60){
                res = "Passed";
            }else{
                res = "Failed";
            }
        }else{
            res = "Invalid";
        }
        System.out.println(res);
         */
//------Nested If Ternary Version

        String res= (score >= 0 && score <= 100)?          //Precondition
                    (score >= 60)? "Passed" : "Failed"     //If Precondition is met we have 2 subconditions to deal with
                    : "Invalid result";                    //else block of the Precondition


        System.out.println(res);

// 1st you have to give the precondition and its else block
//Then inside this precondition you have to give the conditions that needs to be created under this if block.

        System.out.println("----------------------------------------");

        int n = 1;

        String day=(n>=1 && n<=7)?                                //Precondition

                (n==1)?"Mon" :(n==2)?"Tue" :(n==3)?"Wed" :(n==4)?"Thu" :(n==5)?"Fri" :(n==6)?"Sat" :"Sun"

                   :"Invalid day";                                //else block of the Precondition

        System.out.println(day);







    }
}
