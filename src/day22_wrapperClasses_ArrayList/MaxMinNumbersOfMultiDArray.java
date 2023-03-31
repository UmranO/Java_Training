package day22_wrapperClasses_ArrayList;
public class MaxMinNumbersOfMultiDArray {
    public static void main(String[] args) {

    //index of elements:    0   1    2     0    1    2      0     1   2
       int[][] array= {   {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}   };       //indexes of array: 0 ~ 2
    //index of 1D array          0               1                2

       int max=array[0][0];                      //Assuming that the 1st # is the max & compare with the other elements
       int min=array[0][0];                      //Assuming that the 1st # is the min & compare with the other elements

       for(int[] each1DArray : array){           //if we're trying to find the max/min in 1DArray 1 loop would be enough
           for (int eachElement : each1DArray) {     //But we're trying to find the max from all the 1DArrays so 2 loops
               if (eachElement < min){min =eachElement;}        //We have to have 2 if statement max & min
               if (eachElement > max){max=eachElement;}         //has to be checked in 2 independent condition
           }                                                    //if & else can't be used bec if the condition is false
       }                                                        //then else block gets executed right away.
        System.out.println("min = " + min);                     //but else if can be used
        System.out.println("max = " + max);
    }
}
/*
2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
			Ex:	array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };
			output:		Minimum number is: -200
				        Maximum number is: 1000
 */