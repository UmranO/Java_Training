package day20_forEach;
import utilities.ArraysUtility;

import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {
        String str="Cydeo School";

        char[] ch=str.toCharArray();                          //No parameter needed. We created a char[] out of a String
        System.out.println(Arrays.toString(ch));              //Output is: [C, y, d, e, o,  , S, c, h, o, o, l]
                                                              //if we want to get ris of the space we can use replace()
                                                              //before toCharArray()
        str=str.replace(" ","");
        char[] ch1=str.toCharArray();
        System.out.println(Arrays.toString(ch1));             //Output is: [C, y, d, e, o, S, c, h, o, o, l]

System.out.println("-----------------------------------------------------------------------------------------------");

        String str1="Today is a great day to learn java";     //If we want to get every single word out of this String
                                                              //If we want to create a String Array out of this String
        str1.split(" ");                                //So we can split str1 by space bec. words're splited with
                                                              //space. So as a parameter we should give " "
                                                              //after we split it will return an Array created after
                                                              //spliting sentence by " " So it will return an Array o
                                                              //size=8 bec we have 7 space in str1
        String[] words=str1.split(" ");
        System.out.println(Arrays.toString(words));
                                                              //We can split it with anything. eg with great.Since great
        String[] w=str1.split("great");                 //occurs once it divides to 2 parts & great isn't included
        System.out.println(Arrays.toString(w));

        String[] word1=str1.split("Python");            //Since no Python st1 was not splited
        System.out.println(Arrays.toString(word1));

System.out.println("-----------------------------------------------------------------------------------------------");
//----M Way-------------------------------------------------------------------------------------------------------
        String sentence = "Today is a great day";                            //Expected outcome:Java love I
                                                                             //Calling reverse() from our ArraysUtility
        String[] arr =  ArraysUtility.reverse( sentence.split(" ") );  //[Java, love I]-1st split then reverse

        System.out.println(Arrays.toString(arr));

//----M Way 2-------------------------------------------------------------------------------------------------------

        String reversedSentence = ""; //"Java love I"
        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] +" ";
        }

        System.out.println(reversedSentence);

//----UO Way-------------------------------------------------------------------------------------------------------
        String sentence1="I love Java";                       //Expected outcome:Java love I

        String[] split=sentence1.split(" ");
        for (int i = split.length - 1; i >= 0; i--) {
            System.out.print(split[i]+ " ");
        }




    }
}
