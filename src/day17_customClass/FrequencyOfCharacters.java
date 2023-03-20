package day17_customClass;
public class FrequencyOfCharacters {
    public static void main(String[] args) {

// 2. Write a program that can find the frequency of the characters from a string
      String str = "aabcccd";
      String output = "";              //output:a2b1c3d1
                                       //       a b c d
                                       //       2 1 3 1
                                       //first focus on getting the frequencies then you can get chars & concate it
        for (int j = 0; j < str.length(); j++) {       //= dahil etmiyoruz so en son karakteri veriyor length()'i degil
            int count=0;                               //bunu outer loop'un icine ama inner loop'un disina koyuyoruz ki
                                                       //inner loop'un her turn'unden sonra resetlesin diye
            char ch=str.charAt(j);                     //str'in her index'ini temsil eden bir variable yarattik
            for (int i = 0; i < str.length() ; i++) {
                if(ch==str.charAt(i)){count++;}        //ve bunu inner loop'un her bir caharacter'yle karsilastiriyoruz
            }                                          //if equal we are increasing the count by 1

            if(!(output.contains(ch+""))){output+=ch+""+count;}   //Eger baktigimiz character output'da yoksa inner
                                                                  //loop'un disinda outer loop'un icinde count ile
                                                                  //birlikte ekliyoruz
}
        System.out.println(output);                               //outer loop'un disinda print ediyoruz

}
}
//Approach 1st find the frequency of the 1st character then repeat it for the remaining characters
// 2. Write a program that can find the frequency of the characters from a string
//str = "aabcccd";    output:a2b1c3d1