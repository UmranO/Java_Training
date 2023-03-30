package day21_multiDimensionalArray;

import java.util.Arrays;

public class WarmUpTasks_UO {
    public static void main(String[] args){
        String str = "  Hello world      I      love      Java    ";  //since it can't modify it'll return a new object
                                                                      //We don't need the old object any more so =>
        str=str.trim();                        //removes all the empty spaces from the beginning & at the end of String
        System.out.println(str);                                      //It is not a must to use trim() here

        String[] s=str.split(" ");
        System.out.println(Arrays.toString(s));

        String result="";

        for (String each : s) {                               //each of the element of the String[] is assigned to each
           if(!each.isEmpty())                                //If the element in the Array which is represented by
            result+=each+" ";}                                //variable each and is a String is not empty

        result=result.trim();
            System.out.println(result);

        System.out.println("-------------------------------------------------------------------------------------");
        //Check if 2 Strings are Anagram---Ayni harflerden olusuyor

        String str1 = "heart";
        String str2 = "earth";

        char[] c1=str1.toCharArray();
        char[] c2=str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.equals(c1,c2));

        System.out.println("-------------------------");


    }

    }

/*
Warmup tasks:
	1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java

	2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"              output:true
            	str2 = "earth"

             	str1 = "java"
        		str2 = "python"

    		output:false

            listen  sildent

        //We can first sort & then check if those sorted orders are equal to find out if they are anagrams or not

 */
