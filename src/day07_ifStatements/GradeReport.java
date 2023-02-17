package day07_ifStatements;

public class GradeReport {
    public static void main(String[] args){

        int score=50;  // 0 ~ 100
        char grade='A';

             if(score>= 90){grade='A';}               //false: score < 90

        else if(score>= 80 && score<90){grade='B';}   //false: score < 80
                                                      // if 2nd statement is being executed this
                                                      //automatically means 1st block is false: score is less than 90
                                                      //SO therefore score<90 is given default & don't need to write it
                                                      //that 's why not mentioned in the following cases
        else if(score>= 70){grade='C';}               //false: score < 70  false condition of this block will be
                                                      //automatically given to the follwing block in a multibranch if
        else if(score>= 60){grade='D';}               //false: score < 60

        else{grade='F';}

        System.out.println("Your grade is " + grade);

        System.out.println("---------------------------------------------");

        int score1=89;

        String result1="Your grade is ";

        if (score1>=90){result1+='A';}
        else if (score1 >= 80 && score1<90){result1+='B';}
        else if (score1 >= 70 && score1<80){result1+='C';}
        else if (score1 >= 60 && score1<70){result1+='D';}
        else{result1+='F';}

        System.out.println(result1);


    }
}
/*
 A: score >= 90
 B: score >= 80
 C: score >= 70
 D: score >= 60
 F: score < 60


 */

/*
 An integer variable named score is declared and given, Write a program that can print the grade of the student
	Ex:
		score = 95
	     output:
		    Your grade is A
	 Note: Assume that the given score is between 0 ~ 100  So score will be 0 to 100.
 */
/*
 A: score >= 90
 B: score >= 80
 C: score >= 70
 D: score >= 60
 F: score < 60


 */