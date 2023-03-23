package day19_array;

public class MaxNumber {
    public static void main(String[] args) {

        int[] arr = {100, 20, 500, 40, -10, 30};
        int max=arr[0];                              //assume that first element is the maximum number

        for (int i = 0; i < arr.length; i++) {       //i: 1, 2, 3, 4...
           
            if (arr[i] > max){                       //compares the element of the array with current maximum number
                max=arr[i];}                         //replace the current maximum number
        }
        System.out.println("max = " + max);

    }

}

/*
Task:
	1. Write a program that can find the maximum number from an array

 */