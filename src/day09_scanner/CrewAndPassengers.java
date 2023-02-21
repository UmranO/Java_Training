package day09_scanner;

public class CrewAndPassengers {
    public static void main(String[] args){

        int total=50;

        //ternary

        String result1= (total==50 || total==75 || total==100)?            //precondition
                                (total==50)? "20 crew, 30 passengers"      //subcondition
                                :(total==75)? "25 crew, 50 passengers"     //subcondition
                                :"30 crew, 70 passengers"                  //last subcondition-there is no other #
                         :"Invalid Total";                                 //precondition's else
        System.out.println(result1);                                       // # of ? should = to # of :

        //switch
        String result2 = "";

        switch (total){

            case 50:                                        //case(50) boyle de olsa birsey degismez dedi
                result2 = "20 crew, 30 passengers";
                break;

            case 75:
                result2 = "25 crew, 50 passengers";
                break;

            case 100:
                result2 = "30 crew, 70 passengers";
                break;

            default:
                result2 = "Invalid number";

        }

        System.out.println(result2);
    }
}

/*
Create a class named CrewAndPassengers
		Given a number of people on the ship (int number)
		determine how many need to be crew members and how many can be passengers.
		Print how many of each type there should be.
                Total: 50  ====> 20 crew, 30 passengers
                Total: 75  ====> 25 crew, 50 passengers
                Total: 100 ====> 30 crew, 70 passengers
                Any other number of people on the ship is not valid
                Solution1: Use ternary. Do not use more than one println()
                Solution2: Use switch statement. Do not use more than one println()
 */