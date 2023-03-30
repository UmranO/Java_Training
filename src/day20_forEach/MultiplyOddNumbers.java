package day20_forEach;

import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
          if (array[i]%2 !=0){array[i]= array[i] * 2;        //should be multiplied by 2 & assigned back to the element
          }                                                  //at that index
        }
        System.out.println(Arrays.toString(array));

        System.out.println("------------------------------------------------------------------");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]%2 ==0){                          //if we don't give this condition all will be multiplied by 2
                continue;                                  //but we want only the odd values to be multiplied by 2
            }
            numbers[i] = numbers[i] * 2;                   //get the element by numbers[i] & multiply it
        }                                                  //after multiplying it with 2 assign the new value  it to
                                                           //that index
        System.out.println( Arrays.toString(numbers) );

    }
}
/*
1. write a program that can multiply each odd number of an integer array by 2
		            ex:
		            	array = [1,2,3,4,5];
	                output:
	                	array =[2,2,6,4,10]
 */