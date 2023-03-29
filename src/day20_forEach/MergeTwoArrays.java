package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
//----UO Way-------------------------------------------------------------------------------------------
       int[] arr1 = {1,2,3,4};
       int[] arr2 = {5,6};
        int m=0;                                                   //Bu variable else'in icinde olunca surekli 0'liyor
                                                                   //so disarda olmasi lazim
       int [] arr3=new int[arr1.length + arr2.length];

        for (int i = 0, j= arr1.length; i< arr3.length; i++) {    //i-arr1'in index'i icin, j arr3'un baslayacagi nokta
           if (i<j){arr3[i]=arr1[i];}                             //j sabit olmali, artmamali
            else{ arr3[i]=arr2[m]; m++;}                          //m arr2'nin index'inin 0'dan baslamasi icin
        }
        System.out.println(Arrays.toString(arr3));

//----M Way-------------------------------------------------------------------------------------------
        int[] arr1M = {1,2,3,4};
        int[] arr2M = {5,6,7};

        int[] arr3M = new int[arr1.length + arr2.length];           //to make sure that 3rd array has enough capacity to
                                                                    //contain all the elements of arr1 and arr2
        int k = 0 ;                                                 //for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) {                //i: for first array's index numbers
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {                //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("-Testing merge() for int[]s-------------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {70, 80, 90};

        int[] a3 = ArraysUtility.merge(a1, a2);

        System.out.println( Arrays.toString(a3));

        System.out.println("-Testing merge() for double[]s-------------------------------------------------");

        double[] b1 = {10.5, 5.5, 3.5, 6.5, 8.5};
        double[] b2 = {20.5, 15.5, 13.5};

        double[] b3 = ArraysUtility.merge(b1, b2);

        System.out.println(Arrays.toString(b3));

        System.out.println("-Testing merge() for char[]s-------------------------------------------------");

        char[] ch1 = {'A', 'b', 'c', 'D', 'e'};
        char[] ch2 = {'X', 'Y', 'Z'};

        char[] ch3 = ArraysUtility.merge(ch1, ch2);

        System.out.println(Arrays.toString(ch3));

    }
}
/*
write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}
	        output
	            arr3 = {1,2,3,4,5,6}
 */