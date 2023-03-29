package day20_forEach;

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