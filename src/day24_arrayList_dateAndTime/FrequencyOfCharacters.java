package day24_arrayList_dateAndTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args){
        String str = "aaabbbbccccc";
       // Expected result: a3b4c5

        String result="";
        for(String each : str.split("")){                 //since str.split("") is an Array & Array is a data
                                                                //structure we can use foreach loop. We reach each elem.
            int frequency=Collections.frequency(Arrays.asList(str.split("")),each); //Converted Array->ArrayList
                                                                       //so that we can use the Collections'frequency()
            if(!result.contains(each)){result+=each+frequency;}
        }
        System.out.println(result);
    }
}
