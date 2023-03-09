package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   //if we create a Scanner object we can use it 5 times

        int max = -2147483648;                    //Any integer number that user enter will ALWAYS be greater than
                                                  //-2147483648
        for(int i = 0; i < 5; i++ ) {             //i: 0, 1, 2, 3, 4

            System.out.println("Enter a number:");
            int num = input.nextInt();

            if( num > max){                      //if the user entered entry is greater than the current maximum number
                max = num;                       //that we have then user entered number should be the maximum number
            }

        }

        System.out.println("Maximum number is: " + max);

        input.close();


    }

}
// int max=-2147483648; minimum value of the integers -we have a clear condition which is any number the user can enter
//will definetely be greater than this value.
//Burada ben bir input.nextInt()'i variable'a assign etmeden kullndigimda problem oldu. Assign et sonra if Statem.'a koy
//else de gerek yok cunku zaten sadece daha buyukse assign edecek
//Yukaridaki method ile we can find out the max num from a user entered # or any kind of a data structure.
//This is one of the logic we can implement to find out the max #

//1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number
