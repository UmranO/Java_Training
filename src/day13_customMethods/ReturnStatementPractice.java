package day13_customMethods;
import java.util.Scanner;

public class ReturnStatementPractice {
    public static void main(String[] args){

        System.out.println("Enter your grade");
        char grade= new Scanner(System.in).next().charAt(0);

//M--------------------------------------------------------------------------------------
        //Asagida pespese siraladi

         boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade =='D' || grade == 'F';
          if(!isValid)                                                                    // if the grrade is not valid
           {System.err.println("Invalid Grade!");
            return;}                                                                      // terminates the main method

        System.out.println(  (grade=='A')? "Excellent" :(grade=='B')? "Great job"  :(grade=='C')? "Good"
                :(grade =='D')? "Passed" : "Failed" );


//UO--------------------------------------------------------------------------------------
        System.out.println("Enter your grade");
        char grade1= new Scanner(System.in).next().charAt(0);

        if(grade1 !='A' && grade1 !='B' && grade1 !='C' && grade1 !='D' && grade1 !='F'){ //Burada|| kullanma! Ayni anda
            System.err.println("Invalid Grade!");                                         //hicbiri olmamali. En kolayi
            return;}                                                                      //valid'i tarif edip tersini
            String result="";                                                             //kullanmak!
            switch(grade1){

                case 'A': result="Excellent";
                    break;
                case 'B': result="Great Job";
                    break;
                case 'C': result="Good";
                    break;
                case 'D': result="Passed";
                    break;
                case 'F': result="Failed";
            }
            System.out.println(result);

        }
    }
