package day08_ternary_switch;

public class Elevator {
    public static void main (String[] args){


          /*  int floorNumber = 2;

        if(floorNumber >= 1 && floorNumber <= 3){
            if(floorNumber == 1){
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            }else if(floorNumber == 2){
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            }else{
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }
        }else{
            System.out.println("Invalid floor");
        }*/
//-----More Efficient Way-----------------------------------------------------------------

        int floorNumber=1;

        String  result = "Invalid floor";           //Setting the result to the precondition's else outcome
                                                    //This way if precondition is not met I don't need to change result

        if(floorNumber >= 1 && floorNumber <= 3){  //Precondition
                                                   //if Precondition met result is assigned with the expected outcome
            result = "Floor "+floorNumber+" is selected. Companies: ";

            if(floorNumber == 1){
                result += "Lobby, Verizon, Starbucks";    //the corresponding companies added to the result
            }else if(floorNumber == 2){
                result += "Cydeo, NASA, Intelsat";
            }else{
                result += "Lyft, BofA, Stake house";
            }
        }
        System.out.println(result);                      //whatever the result is printed
    }
}

/*
1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			anything else: print "Invalid floor - 6"
 */