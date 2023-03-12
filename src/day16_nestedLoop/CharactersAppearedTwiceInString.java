package day16_nestedLoop;

public class CharactersAppearedTwiceInString {
    public static void main(String[] args) {

 //Find the characters of a String which appeared in the String twice

        String str="aaabbccccddeeeeff";
        String result="";       //"bdf"

        for (int j = 0; j <str.length() ; j++) {
            char ch=str.charAt(j);                              //each character of str
            int count=0;
          for (int i = 0; i < str.length(); i++) {              //responsible for comparing ch to each character
              if (str.charAt(i)==ch) {                          //of str & return the frequency of ch
                count++;
                }
            }
          if(count==2 &&(!(result.contains(ch+"")))) {result+=ch;}
        }
        System.out.println(result);
    }
}


//the inner loop is responsible for finding the frequency of the char
//Everytime the outer loop is executed the inner loop will be repeated for multiple times
//During outer loop's 1st execution char at index 0 will be compared with every char of the inner loop