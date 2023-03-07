package day13_customMethods;

public class ReturnMethodIntro {
public static void main(String[] args) {

        //int total = sum(20, 40);                              //sum is a void method, does not return any data so
                                                                //be treated as data outside this () can't be assigned
                                                                //to a variable addition is a return method, so data
        int total =   addition(10, 20);                         //returned from the () after execution can be stored
                                                                //into a variable and can be used in anywhere
        int t = square(10);                                //That is the only diff. btw return & void ()s

        System.out.println(  square(10) );

        System.out.println( cube(5));

        int r = cube(5);

        }

public static void sum(int n1, int n2){                        //sum is a void method, does not return any data
        int result = n1 + n2;                                  //so since this data can't be used outside the() can't
        System.out.println(result);}                           //be treated as data outside this ()



public static int addition(int n1, int n2){
        int result = n1 + n2;
        return result;                                        //if the return type is not void you should have return
        }                                                     //statement as the last statement returning the data


public static int square(int num){
        int square = num * num;
        return square;
        }


public static int cube(int num) {
    int cube = square(num) * num;                      //whichever # we want to find the cube for we can pass the
    return cube;                                       //square(num)'s return value (is reusable when you call the
   }                                                   //())* num-data

        }