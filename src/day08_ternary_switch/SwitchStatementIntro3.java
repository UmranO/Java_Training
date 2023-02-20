package day08_ternary_switch;

public class SwitchStatementIntro3 {
    public static void main(String[] args){

        int score = 85; // 0 ~ 100   //It is not wise to do this task with switch. In case you want to do it you need to
                                     //create between 0 to 100 case blocks. So it is good to go with an if statement
                                     //where you can give a range.

        String result = "";

        if(score >= 90){ // false: score < 90
            result = "A";
        }else if(score >= 80 && score < 90){ //false: score < 80
            result = "B";
        }else if(score >= 70){ // false: score < 70
            result = "C";
        }else if(score >= 60 ){ // false: score < 60
            result ="D";
        }else{ // score < 60
            result = "F";
        }


    }
}
