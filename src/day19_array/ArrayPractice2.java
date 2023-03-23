package day19_array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        int[] number=new int[100];

        int[] numbersReversed=new int[100];

//        for (int i = 0, j=1; i <= number.length-1; i++, j++) {       i-index# are 0~99 so to start from 1 we can
//            number[i]=j;                                            //declare a secondary variable j & start i from 1
//        }

        for (int i =0, j=10; i < number.length; i++,j+=10) {     //If we want to print starting from 10 & increase by10
            number[i]=j;
        }
        System.out.println(Arrays.toString(number));

        System.out.println("--------------------------------------------");
        for (int i = 0; i < number.length; i++) {
            number[i]=i+1;

        }
//        for(int i = 0, j=100; i <= number.length-1; i++,j--){
//            numbersReversed[i]=j;
//        }

        for (int i =0 ; i <numbersReversed.length; i++) {
            numbersReversed[i]=numbersReversed.length-i;
        }

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(numbersReversed));

    }
}

//create an Array and assign the numbers between 1-100
//create an Array and assign the numbers between 100-1
