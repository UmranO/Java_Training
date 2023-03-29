package day20_forEach;
import utilities.ArraysUtility;

import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
//----UO Way-------------------------------------------------------------------------------------------
        int[] array = {1, 2, 3, 4, 5};
        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++)
            reverse[j] = array[i];                               //getting the element at the index i & assigning to the
        System.out.println(Arrays.toString(reverse));           //reverse array's indexes

//----M Way-------------------------------------------------------------------------------------------
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        int[] reverse1 = new int[arr.length];                   // {5, 4, 3, 2, 1} from last to the 1st

        for (int i = arr.length - 1, j = 0; i >= 0; i--) {        //j'yi burada declare etmis ama
            reverse1[j++] = arr[i];                              //artisi burada yapiyor, j++ oldugu icin de ilk once 0,
        }                                                       //sonraki turda 1 oluyor
        System.out.println(Arrays.toString(reverse1));

        System.out.println("------------------------------------------");

        int[] nums = {100, 200, 300, 400, 500};
        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));


    }
}
/*
3. Write a program that can reverse an array of integers and returns it as new array
	        ex:array = {1,2,3,4,5};
	        output:reversedArray = {5,4,3,2,1};
 */
