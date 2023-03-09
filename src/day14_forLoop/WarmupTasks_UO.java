package day14_forLoop;

public class WarmupTasks_UO {
    public static void main(String[] args) {

        String str="onlkma";
        String str1="eight";
        System.out.println(combine(str, str1));

        int in1=5, in2=7;
        System.out.println(sumOf2Numbers(in1, in2));

        int a=1, b=6;
        System.out.println(sumOf3Numbers(sumOf2Numbers(in1, in2),a));

        System.out.println(sumOf4Numbers(sumOf2Numbers(in1, in2),a, b));

    }
//Task1_U-------------------------------------------------------------------------------------------------------
    public static String combine(String str, String str1){
        String result=(str.charAt(str.length()-1)==str1.charAt(0))?         //char'lari == ile karsilastirabiliriz
                str+""+str1.substring(1) :str+str1;
        return result;
    }
//Task1_M---------------------------------------------------------------------------
    public static String combineM(String str, String str1){
        String result="";
        if (str.endsWith(str1.charAt(0)+"")){                  //endsWith() requires String but with str1.charAt(0) we
            result=str+str1.substring(1);}           //are passing char parameter so to convert char
        else{result=str+str1;}                                 //to String we add ""
        return result;                                         //By adding "" we can convert any value (int, boolean...)
    }                                                          //to String value

//Task2a_U-------------------------------------------------------------------------------------------------------
    public static int sumOf2Numbers(int in1, int in2){
        return in1+in2;
    }
//Task2b_U-------------------------------------------------------------------------------------------------------
        public static int sumOf4Numbers( int sumOf2Numbers, int a, int b){
        return sumOf2Numbers+a+b;
    }
//Task2c_U-------------------------------------------------------------------------------------------------------

        public static int sumOf3Numbers( int sumOf2Numbers, int a) {
        return sumOf2Numbers+a;
    }

}

/*
Warmup Tasks:
	Task1:
	    Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that
        	character once.

	        combine("one", "eight")  ==> oneight

	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers
 */