package day11_string;

import java.util.Scanner;
public class DigitLetterSpecialChar {
    public static void main(String[] args ) {
//M-------------------------------------------------------------------------------------------------------------
        // System.out.println("".charAt(0));
  /*
        String str = new Scanner(System.in).nextLine();     //If Scanner obj will be used once no need to assign it to a
                                                            //variable. Just call the method that gets the String input
                                                            //from Scanner object right away. In this case we don't even
                                                            //have to give the close() bec. this indicates that Scanner
                                                            //object will be used only once & it will be unreferenced
                                                            //which means unusable :garbage collection

        if (str.length() >= 1) { // if the string has at least one character

            char f = str.charAt(0); //the first character of string

            if (f >= '0' && f <= '9') {                                   //if we give 0 as a char '0' <> operators will
                System.out.println("first character is digit");         //compare their # in the ASCCI table which is 48
            } else if (f >= 'A' && f <= 'Z') {                            //not the character
                System.out.println("first character is uppercase letter");
            } else if (f >= 'a' && f <= 'z') {
                System.out.println("first character is lowercase letter");
            } else {
                System.out.println("first character is special character"); //If none of the above it should be spec. charac.
            }

        } else { // if string is empty
            System.out.println("String is empty");
        }
  */
//UO-------------------------------------------------------------------------------------------------------------
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.nextLine();                 //if u use next() here it doesn't print the last option &
        String result="first character is ";          //continues to run bec next() can't get enter (empty word)

        if(word.length()>=1) {
            if (word.charAt(0) >= 48 && word.charAt(0) <= 57) {result += "digit";}    //digit if bet 48-57 in ASCII
            else if (word.charAt(0) >= 65 && word.charAt(0) <= 90) {result += "uppercase letter"; }
            else if (word.charAt(0) >= 97 && word.charAt(0) <= 122) {result += "lowercase letter";}
            else {result += "special character";}
        }
        else {result="Word is empty";}
        System.out.println(result);

        input.close();
    }
}

/*
3. Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
                    - if the word starts with uppercase letters, print "first character is uppercase letter"
                    - if the word starts with lowercase letters, print "first character is  lowercase letter"
                    - if the word starts with special characters, print "first character is special character"


                    HINT: You need to check the ascii table
UOS: Bec each character has a # in ASCII Table the number values will be copared if we use the relational operators
like > < not the characters.
You can either write the number values and compare or you can give as the char in '' and compare

 */


