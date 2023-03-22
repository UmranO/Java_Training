package day19_array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

//Without Data Structures this is how you'll end up creating 5 variables to store 5 score / Not efficient
        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

        System.out.println("-------------------------------------------------------------------------");

//Instead use a Data Structure
        int[] scores;                //1st step declare Array variable. Can also be written as: int scores []
        scores=new int[5];           //2nd step we need to give the Array object & set the size of that Array object
                                     //and store it into this variable scores
                                     //Then once this Array variable scores is referancing to that Array object then we
                                     //will be able to store multiple elements into that Array object.
        //int[] scores=new int[5];   Can also be declared,instantiated  and the number of elements set at the same time.
        //Since Array instead of () we use []

        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;

        // scores[5] = 100;
        // scores[-1] = 65;
        // scores = new int[10]; //index: 0 ~ 9
        // scores = new int[50]; //index: 0 ~ 49

        System.out.println(Arrays.toString(scores));  //Will print the whole Array
        System.out.println(scores[2]);                //Will print the specific elem in the specified index which is 78
                                                      //Since we have integer at index 2 we don't need to call toString
                                                      //from Arrays utility class
        System.out.println("--------------------------------------------");
                                             //If we want to print every single element of the Array we need to use loop

        for (int i = 0; i < scores.length; i++) { // i: index numbers of scores array
            System.out.println(scores[i]);
        }

        System.out.println("--------------------------------------------");

        System.out.println( scores[scores.length-1] );


    }
}
