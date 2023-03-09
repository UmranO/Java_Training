package day14_forLoop;

public class StringReverse {
    public static void main(String[] args){

        String str="Java";                                               //Write a program to Reverse the str ->avaJ
        //          0123
        String reverse="";                                               //"avaJ"

        for(int i=str.length()-1; i>=0; i--){      //i: index # of a given String starting from last index to index 0
            reverse+=str.charAt(i);                //to get each character of String starting from last index to index 0
        }
        System.out.println(reverse);

        System.out.println("-------------------------------------");

        System.out.println(reverse("Umran Ozman"));

        System.out.println("-------------------------------------");

        String name = "Ermek Keneshbekovich Apazov";

        String result = reverse(name);

        System.out.println(result);

        System.out.println("-------------------------------------");
    }

    public static String reverse(String str){
        String reverse="";
        for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    }



