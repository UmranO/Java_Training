package day06_OperPrecedence_AND_ifStatements;

public class GradeLevel2 {

    public static void main(String[] args) {

        int gradeLevel = 16;

        String result = "" ; // temporary value to avoid the error. Empty string - no space
                             // If the variable not initialized you can not use it as for the local variables.
                             // So a temp. value is assigned

        if(gradeLevel >= 1 && gradeLevel <= 5){  // if this condition is true Elem.School should be stored in result
            result = "Elementary School";
        }

        if(gradeLevel >= 6 && gradeLevel <= 8){
            result = "Middle School";
        }

        if(gradeLevel >= 9 && gradeLevel <= 12){
            result = "High School";
        }

        if(gradeLevel >= 13 && gradeLevel <= 16){
            result = "College";
        }

        if(gradeLevel >= 17 && gradeLevel <= 18){
            result = "Grad School";
        }

        System.out.println("result = " + result); //Print Statement should be given at the end of all the if statements

    }

}

//Alternatif to writing a print statement to each if statement,a variable can be declared before all the if statements
//to store data that the if statements might give me can be. Storing data to the variable result
//to it since at the end 1 if statement will be executed and after it we can print the print statement with the variable
