package day20_forEach;
import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {
        String str="Cydeo School";

        char[] ch=str.toCharArray();                          //No parameter needed. We created a char[] out of a String
        System.out.println(Arrays.toString(ch));              //Output is: [C, y, d, e, o,  , S, c, h, o, o, l]
                                                              //if we want to get ris of the space we can use replace()
                                                              //before toCharArray()
        str=str.replace(" ","");
        char[] ch1=str.toCharArray();
        System.out.println(Arrays.toString(ch1));             //Output is: [C, y, d, e, o, S, c, h, o, o, l]

    }
}
