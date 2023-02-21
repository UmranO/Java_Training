package day09_scanner;

public class IfAndSwitch {                                           //If & Switch combined
    public static void main (String[] args){

        int number = 75;

        if (number==50 || number==75 || number==100){                //Under this precondition there are3 possibilities
                                                                     //We are just using == to check if a value is equal
                                                                     //to another value. Since we are using == operator
                                                                     //when we are creating those conditions we can use
            switch (number){                                         //switch

                case 50:
                    System.out.println("20 crew, 30 passengers");
                    break;

                case 75:
                    System.out.println("25 crew, 50 passengers");
                    break;

                default:
                    System.out.println("30 crew, 70 passengers "); //Under this precondition there are3 possibilities
            }                                                      //that's why we can give the 3rd poss. to default
        }else{                                                     //block. There is no other possibility.
            System.out.println("Invalid number");

        }

    }
}
/*
1. Create a class named CrewAndPassengers
		Given a number of people on the ship (int number)
		determine how many need to be crew members and how many can be passengers.
		Print how many of each type there should be.
                Total: 50  ====> 20 crew, 30 passengers
                Total: 75  ====> 25 crew, 50 passengers
                Total: 100 ====> 30 crew, 70 passengers
                Any other number of people on the ship is not valid
 */