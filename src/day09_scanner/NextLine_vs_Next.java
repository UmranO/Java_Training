package day09_scanner;

import java.util.Scanner;
public class NextLine_vs_Next {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt(); //Things typed on the keyboard are: 45+Enter which is the new line. And the new
                                   //line in Java is given by \n escape sequence so 45\n is entered a\& nextInt(0 can
                                   //only reads from left to right till the last digit (in this case 5) & Enter goes to
                                   //the Scanner's memory. OnlynextLine() can read the Enter
                                   //Whenever a Scanner method is called they'll always check what is left in the
                                   //Scanner's memory.They'll check if any data is left in S.Memory that they can read
                                   //If none they'll wait for the user's input. But now we have Enter in Scan.Memory and
                                   //among all the Scanner ()s nextLine is the only () that can read Enter key. So when
                                   //called it will check the memory by default & takes that data (now we haveEnter key)
                                   //and it sets that data to full name So that's why it printed enter for full name

        input.nextLine();          //Enter  This extra nextLine() is added to take the extra Enter & since I won't use
                                   //it I won't assign it to a variable.

        System.out.println("Enter your full name:"); //&once the Enter key is taken when we call nextLine() again since
        String full_name = input.nextLine();         //the Sc. Memory is empty now nextLine() will look for the user
                                                     //input. We can use 1 nextLine to take everything left in the
                                                     //Scanner-for ex. more than 1 enter is left

        System.out.println("age = " + age);
        System.out.println("full_name = " + full_name);

    }
}
