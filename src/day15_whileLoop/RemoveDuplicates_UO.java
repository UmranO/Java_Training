package day15_whileLoop;

public class RemoveDuplicates_UO {

    public static void main(String[] args) {
        String result="";                                                  //Creat a temp variable with an empty String
        String str="aabbbcccc";                                            //to store the final result "abc"

        for (int i = 0; i < str.length(); i++) {                           //since w start from index=0 & used < no need
            if (result.contains(str.charAt(i)+"")) continue;               //subtract 1 from the length()
            else result+=str.charAt(i)+"";     //M else koymamis gereksiz    i is representing the index number of the
        }                                                                  //String
        System.out.println(result);

    }


}
/*
3. Write a program that can remove the duplicated characters from a string
				Ex:
					str = "aabbbcccc"
					output:
						abc
 */

//We can get the characters of String with charAt() and we can repeat it with a loop to get every single char of the
//String starting from the 1st character to the last character.