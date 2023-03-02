package day12_customMethods;

public class CustomMethodIntro {
    public static void main(String[] args){

    System.out.println("Test started");                 //1st statement to be printed

    greetings();                                        //calling a method is equivalent of giving the code fragments
                                                        //within the body of that method. After all the lines within the
                                                        //body of the () is performed than it will go to the next line
                                                        //of this method -main()- we are calling from
    System.out.println("Test completed");               //4th statement to be printed


    }

    public static void greetings(){                    //delaration of the method-In order to use this () you need to
                                                       //call it
        System.out.println("Hello Cydeo!");            //2nd statement to be printed
        System.out.println("How are you today?");      //3rd statement to be printed

    }
}
