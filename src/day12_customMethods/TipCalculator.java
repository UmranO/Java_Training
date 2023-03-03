package day12_customMethods;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){

        Scanner input=new Scanner (System.in);


        System.out.println("Split or No split (Yes or No)");
        String isSplitted=input.next().toLowerCase();                          //To be able to ignore Case sensitivity
                                                                               //"YES"==>yes
        System.out.println("Enter the # of people");
        int numOfP=input.nextInt();

        System.out.println("Enter the check amount");
        double checkAmount=input.nextDouble();                       //$ 100

        input.nextLine();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serQ=input.nextLine().toLowerCase();                      //Regardless of caseSensitivity to ignore
                                                                         //Case sensitivity of the user entered or
        input.close();                                                   //later we can compare it with equalsIgnoreCase
                                                                         //with our source code which has lowerCase only


        // we can use if statement, ternary or switch
        double totalTip= (serQ.equals("poor"))? checkAmount*5/100
                        :(serQ.equals("fair"))? checkAmount*10/100
                        :(serQ.equals("good"))? checkAmount*15/100
                        :(serQ.equals("great"))? checkAmount*20/100 : checkAmount*25/100;


        double totalToPay = checkAmount + totalTip;                 // $125

        System.out.println("Number of people: "+ numOfP);
        System.out.println("Total to pay: "+totalToPay);
        System.out.println("Total tip: "+totalTip);

        if(isSplitted.equals("yes")){
            System.out.println("Total per person: " +  (totalToPay/numOfP) );
            System.out.println("Tip per person: " + (totalTip/numOfP) );
        }



    }
}

/*
    double totalTip = (service.equals("excellent"))? amount * 0.25  // $ 25
            :(service.equals("great"))? amount * 0.2
            :(service.equals("good"))? amount * 0.15
            :(service.equals("fair"))? amount * 0.1
            : amount * 0.05;

---UO--------------------------------------------------------------------------------------------------------
        if(isSplitted.equals("Yes")){

        System.out.println("Number of people entered: " + numOfP +
                "\nTotal to pay: "+(checkAmount+totalTip)+
                "\nTotal tip: "+ totalTip+
                "\nTotal per person: "+(checkAmount+totalTip)/numOfP+
                "\nTip per person: "+totalTip/numOfP);}

        else System.out.println("Total to pay :" + (checkAmount+totalTip)+ "\n+Total tip: "+(totalTip));
*/



/*
 3. Create a class called TipCalculator, and write a program for a tip calculator.
	    There will be different service quality benchmarks that will determine the tip given.
	    There will also the ability to calculate based on the number of people in the party and if there is a
	    split of the bill or not.

	        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	    The program should ask the user to enter:
	            - Split or No split (Yes or No),
	             - Enter the number of people (number)
	             - Enter the check amount (number)
	             - Service Quality (String)

	    And then it should display:
	             Number of people entered
	             Total to pay
	             Total tip
	             Total per person
	             Tip per person:

		    Ex:
		        Split or No split (Yes or No)?
		        YeS
		        Enter the number of people
		        4
		        Enter the check amount:
		        476
		        How was the service quality? (Excellent/Great/Good/Fair/Poor)
		        ExCElLeNt

		        output:
		            Number of people entered: 4
		            Total to pay: 595.0
		            Total tip: 119.0
		            Total per person: 148.75
		            Tip per person: 29.75
 */