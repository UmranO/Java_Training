package day16_nestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {

//Find the frequency of all the characters of a String

        String str = "aaabbccccddeeeeff";
        String result = "";
        String sonuc = "";

        for (int j = 0; j < str.length(); j++) {        //----Dis loop'un her elemanini icerdekinin her elemani
            int count = 0;                                       //ile kiyasliyoruz.
            char ch = str.charAt(j);                             //Bu disardakinin elemanlarini temsil ediyor.

            for (int i = 0; i < str.length(); i++) {    //----Ic loop burada basliyor-------------------------
                if ((ch) == (str.charAt(i))) {                   //Didardakinin 0'incisi once icerdekinin 0, 1,2.sirayla
                    count++;                                     //karsilatiriyoruz ayni ise count'u artiriyoruz.
                }                   //-------------------------------------if statement burada bitiyor-----------
            }                                           //----Ic loop burada bitiyor-------------------------

            if ((!result.contains(ch+""))) result += count+""+ch;

        }                                              //----------------Dis loop burada bitiyor-------------

        System.out.println(result);
    }                               //--------------------------------------main()-----------------------------
}                                   //--------------------------------------class()----------------------------



//Find the FrequencyOfCharacters:
//"AAABBCCCCDDDDD    output:A3B2C4D5