package day17_customClass;

public class UniqueCharacters1 {
    public static void main(String[] args) {

        String str="aabcccd";
        String unique="";

        for (int i = 0; i < str.length(); i++) {                        //i : index # of str
            char each =str.charAt(i);
            if (str.indexOf(each)==str.lastIndexOf(each)){             //if the 1st and last appearance of the character
                unique+=each;}                                         //are same that means character is unique
        }                                                              // for loop ends
        System.out.println(unique);

    } //main
}  //Class

//    Warmup Tasks:
//        1. Write a program that can find the unique characters from a String
//        Ex:
//        str = "aabcccd"
//
//        output:
//        bd