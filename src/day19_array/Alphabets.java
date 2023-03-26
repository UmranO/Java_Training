package day19_array;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

        char[] ascending = new char[26];                                            //index: 0~25
        char[] descending = new char[26];                                           //index: 0~25

        for (int i = 0, j = 'A', k ='Z' ; i < ascending.length; i++, j++, k--) {   //'A''yi burada kullaninca direct int
                                                                           //olarak degerlendiriyor (Buradaki degeri 65)
                                                                           //so 65 will be assigned to j.
            ascending[i]  = (char) j; // A ~ Z     The data type of j is int here. So to convert int to char we have to
            descending[i] = (char) k; // Z ~ A     explicitly cast it.When we cast it to char whatever the int number be
                                              //converted to char & char will be assigned to the index of this element
        }                                     //Since both Arrays have the same size we can use the same loop to iterate

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));



    }
}

/*

	3. Create a char array and store all the alphabet letters in ascending order

	4. Create a char array and store all the alphabet letters in descending order
 */