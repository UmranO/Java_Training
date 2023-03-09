package utilities;

public class StringUtility {

//----reverse() to reverse a given String-------------------------------------------------------------------------------
    public static String reverse(String str){
        String reverse = "";                              //to contain all the characters of the given string in
                                                          //reversed order
        for(int i = str.length() - 1 ; i >= 0; i-- ){     //i: index number of the given string starting from last index
                                                          //to index 0 to get each character of the String starting
            reverse += str.charAt(i);                     //from last index to index zero & then  concate it to reverse
        }                                                 //so that this reverse at the end will have all characters of
        return reverse;                                   //the given String in reversed order. Then we returned it
    }                                                     //from the method so that we can use it later

}




//Any time at any place in this project if we want to use this reverse() we can always call thereverse() through the
//Class name StringUtility