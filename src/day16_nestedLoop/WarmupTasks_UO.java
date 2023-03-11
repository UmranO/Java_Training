package day16_nestedLoop;
import java.util.Locale;
import java.util.Scanner;
public class WarmupTasks_UO {
    public static void main(String[] args) {

//1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application,

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = input.nextLine();
        System.out.println("Enter your password");
        String password = input.nextLine();

        if ((username.equals("Cydeo")) && (password.equals("WoodenSpoon"))) {
            System.out.println("Logged in.");
        } else {
            for (int i = 1; i <= 3; i++) {
                    System.err.println("Invalid credentials Enter your username ");
                    username = input.nextLine();
                    System.err.println("Enter your password");
                    password = input.nextLine();
              if ((username.equals("Cydeo")) && (password.equals("WoodenSpoon"))){ //if the user enters valid credentials
                  System.out.println("You are now Logged in."); break;}                        // exits the loop

            }   if( ! (username.equals("Cydeo") && password.equals("WoodenSpoon") ) ){ // after all three attempts, if the username & password are still incorrect
                System.err.println("Your account now is locked, please contact with the support team");
            }
        } input.close();

        System.out.println("---------------------------------------------------------------------");
//2. write a program that can return the frequency of a character from a string

        String str = "aaabbbbccccc";
        char ch = 'c';    // output:5
        int count=0;

        for (int i = 0; i <=str.length()-1; i++) {
            if(str.charAt(i)=='c') count+=1;
        }
        System.out.println(count);

        System.out.println("---------------------------------------------------------------------");
/*
 3.  Write a program that can return the frequency of the word java from a sentence
        Ex:
        sentence = "java JAVA jAvA JAva"
        output:
        4
 */

        String str1="java JAVA jAvA JAva";
        str1=str1.toLowerCase();
        int l=str1.length();
        System.out.println(l);

        str1=  str1.replaceAll("java","javac");

                System.out.println(str1.length()-l);

        System.out.println("-----------------------------------------");

        String sentence = "java JAVA jAvA JAva";
        sentence=sentence.toLowerCase();

        int count1=0;
        while(sentence.contains("java")){
            sentence=sentence.replaceFirst("java","");
            count1++;
        }
        System.out.println(count1);

        /*
        "Java Java java Java"  //count=0
        "Java Java java"       //count=1
        "Java Java"            //count=2
        "Java"                 //count=3
        ""                     //count=4


         */

        System.out.println("-----------------------------------------");
        int count2=0;
        String sen="Java Java Java Java Java Java    Java";
        String wor="Java";
        for (int i = 0; i <= sen.length()-wor.length(); i++) {           //Burada kritik olan substring'in son index'i
           if(sen.substring(i,i+4).equals(wor)) {count2++;}               //dahil etmiyor o yuzden length()'den 1 cikarma
                                                                         //ve bir fazlasini koy substring olustururken
        }
        System.out.println(count2);

    }
}
/*
    Warmup tasks:
        1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application,
        assume that your credentials are:
        username: Cydeo
        password: WoodenSpoon

        Ask the user to enter their credentials.
        If credentials are matched, your program should print "Logged in."

        If the credentials are not matched, the program should allow
        the user to have three attempts to enter correct credentials

        if all three attempts are failed, then print "Your account is lucked."


        2. write a program that can return the frequency of a character from a string
        Ex:
        str = "aaabbbbccccc"
        ch = 'c'

        output:
        5

        3.  Write a program that can return the frequency of the word java from a sentence
        Ex:
        sentence = "java JAVA jAvA JAva"

        output:
        4



        "xxyyyzzz"


        Task:
        1. Write a program for a simple calculator
        1.1 ask the user to enter first number: (double)
        1.2 ask the user to enter a math operator: (-, +, *, /)
        if the user enters invalid math operator, reapet the same step until user enters a valid operator

        1.3 ask the to enter the second number: (double)
        1.4 display the calculation result
        1.5 Would you like to continue? (Yes/No)



        2. FrequencyOfCharacters:
        "AAABBCCCCDDDDD"

        output:
        A3B2C4D5


 */