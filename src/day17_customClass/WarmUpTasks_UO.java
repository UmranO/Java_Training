package day17_customClass;

public class WarmUpTasks_UO {
    public static void main(String[] args) {

//1. Write a program that can find the unique characters from a String
        String str = "aabcccd";    //output:bd

        String result = "";
        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            if (count == 1 && (!(result.contains(str.charAt(j) + "")))) {
                result += str.charAt(j);
            }
        }
        System.out.println(result);

        //----variable'li more readable--------------------------0--------------------------

        String str1 = "ASCVGTAHTG";    //output:SCVH
        String result1 = "";
        for (int j = 0; j < str1.length(); j++) {
            int count1 = 0;
            char ch = str1.charAt(j);
            for (int i = 0; i < str1.length(); i++) {
                if (ch == str1.charAt(i)) {
                    count1++;
                }
            }
            if (!(result.contains((ch) + "")) && (count1 == 1)) {
                result1 += ch;
            }
        }
        System.out.println(result1);

//Task2 ------------------------------------0------------------------------------------
//2. Write a program that can find the frequency of the characters from a string
            String s = "aabcccd";    //output:2a1b3c1d

            String output = "";

            for (int j = 0; j < s.length(); j++) {
                int count = 0;
                char c = s.charAt(j);
                for (int i= 0; i < s.length(); i++) {
                    if (c == s.charAt(i)) {
                        count++;
                    }
                }
                if (!(output.contains(c + ""))) {
                    output += count + "" + c;
                }
            }
            System.out.println(output);

        }
    }

//    Warmup Tasks:
//        1. Write a program that can find the unique characters from a String
//        Ex:
//        str = "aabcccd"
//
//        output:
//        bd
//
//        2. Write a program that can find the frequency of the characters from a string
//
//        Ex:
//        str = "aabcccd";
//
//        output:
//        a2b1c3d1