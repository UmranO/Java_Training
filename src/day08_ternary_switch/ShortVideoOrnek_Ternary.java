package day08_ternary_switch;

public class ShortVideoOrnek_Ternary {
    public static void main(String[] args){

        int score = 70;
        char grade;

        if(score >= 90){grade='A';}        // All the block are returning char value so can be turned into a ternary
        else if(score >= 80){grade='B';}
        else if(score >= 70){grade='C';}
        else if(score >= 60){grade='D';}
        else{grade='F';}

       //System.out.println(--Ternary version-------------------------------------------------------)

        char grade1 =(score>=90)? 'A' :(score>=80)? 'B' :(score>=70)? 'C' :(score>=60)? 'D' :'F';

        System.out.println(grade+" = "+grade1);
    }
}
