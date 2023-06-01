package day24_arrayList_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
      ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        //output: [4, 5, 6, 7, 4, 5, 6, 7]
//----M Way-------------------------------------------------------------------------------------------------------------
        list.removeIf(p-> p<4);                 //variable p stands for each element of Collection -> is for Lambda Expres
        System.out.println(list);               //We can't use regular remove() while iterating a Collection bec index#s
                                                //will be shifted & the result will be wrong! So we should use removeIf

        System.out.println("--------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll( Arrays.asList("Java", "Python", "C#", "Java", "Ruby", "JavaScript", "C++", "C") );

        names.removeIf(p-> p.startsWith("J"));
        System.out.println(names);

        System.out.println("--------------------------------------------------");


//----UO Way------------------------------------------------------------------------------------------------------------        list.removeAll(Arrays.asList(1,2,3));  //In removeAll() you have to specify all the elements that are less than
                                               //4 so not practical & if you don't know the elements you can not use
        System.out.println(list);              //removeAll().

        for (int i=list.size()-1; i>=0; i--) {           //Bu da MeteOkul yolu
           if (list.get(i)<4){list.remove(list.get(i));}
        }
        System.out.println(list);




    }
}


/*
 2. Write a program that can remove the elements that are less than 4, from an ArrayList of integer

          Ex:list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};
          output: [4, 5, 6, 7, 4, 5, 6, 7]


 */

