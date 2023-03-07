package day13_customMethods;

public class ReturnMethodsPractice {
    public static void main(String[] args) {
        System.out.println(isOdd(4));
        System.out.println(isOdd1(4));
        System.out.println(isOdd2(99));
        System.out.println("------------------");
        System.out.println(isEven(1));
        System.out.println(isEven1(1));
        System.out.println(isEven2(1));
        System.out.println("------------------");
        System.out.println(maxN(7, 9));
        System.out.println(maxN1(7, 9));
        System.out.println("------------------");
        System.out.println(min(7,11));
    }
//Create a method named isOdd, that can return true if a number is an odd number
    //UM---------------------------
    public static boolean isOdd(int nu1) {
        boolean result = false;
        if (nu1 % 2 != 0) result = true;
        return result;
    }

    //M----OR----------------------
    public static boolean isOdd1(int nu10) {
        if (nu10 % 2 != 0) {
            return true;
        }
        return false;}
    //M----OR----------------------
    public static boolean isOdd2(int num){
       return (num % 2 != 0)? true : false;}

//Create a method named isEven, that can return true if a number is an even number

    public static boolean isEven ( int n1){
            return (n1 % 2 == 0) ? true : false;
        }
    //M----OR----------------------
     public static boolean isEven1(int number){
        return !isOdd(number)? true :false;
        }
    //M----OR----------------------
        public static boolean isEven2(int number1){
        return (!isOdd(number1)) ;
        }

//Create a method named max, that can return the maximum number between two numbers

    //UM---------------------------
    public static int maxN(int numb1, int numb2){
        int max=(numb1>numb2)? numb1 : numb2;
        return max;
    }
    //M----OR----------------------
        public static int maxN1 ( int numb1, int numb2){
            return numb1 > numb2 ? numb1 : numb2;           //() is a must in if statement but in ternary it is optional
        }                                                   //(numb1 > numb2) ? numb1 : numb2; same as this
    //M----OR----------------------
    public static int max(int n1, int n2){

        if(n1 > n2){
            return  n1;
        }else{
            return n2;
        }
    }
//Create a method named min, that can return the minimum number between two numbers
//UM---------------------------
    public static int min(int n1, int n2){
        return (n1<n2)? n1 : n2;
    }



}
/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */
