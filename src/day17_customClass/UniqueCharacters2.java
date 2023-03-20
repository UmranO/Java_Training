package day17_customClass;
public class UniqueCharacters2 {
    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {        //beginning of outer loop

            char ch = str.charAt(j);                    //1st find the frequency of the 1st char=a
            int frequency = 0;                          //after each execution of the inner loop this has to be resetted
            for (int i = 0; i < str.length(); i++) {    //beginning of inner loop which checks how many times the ch has
                                                        //appeared in str
                if(str.charAt(i) == ch ){               //if the ch has appeared in the string
                    frequency++;                        //increase the frequency by 1
                }
            }                                           //end of inner loop

            if(frequency == 1){                         //if the frequency is one, then it's unique
                unique += ch;
            }
        }                                               //end of outer loop

        System.out.println(unique);
    }
}
//This is a universal approach to find the unique element:
//1st we are finding the frequency of the 1st element in the inner loop and
//repeating this for all the elements in the outer loop

//    Warmup Tasks:
//        1. Write a program that can find the unique characters from a String
//        Ex:
//        str = "aabcccd"
//
//        output:
//        bd
//