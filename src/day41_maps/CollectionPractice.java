package day41_maps;
import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

System.out.println("--List of Lists--------------------------------------------------------------------------");

        List<List<Integer>> lists = new ArrayList<>();         //Term multidimensional is NOT used in Collection like
                                                               //Array. We can have multidimentional Arrays but can't
                                                               //have multidimentional Collection types. BUT we can have
                                                               //List of Lists, List of Sets...
        //lists.addAll(Arrays.asList(list1, list2));     Like in all the ArrayLists we can use addAll() to add the lists

        lists.add(list1);
        lists.add(list2);

        System.out.println(lists);                           //=> [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11]]

        //How can we get the Element 10 from lists:

        System.out.println(lists.get(1).get(3));             //1st we should get the list that 10 is in from lists, then
                                                             //we should get that element from that list (list2)

        //To print out each element of the lists:              We need nested for each loop to get each element

        for (List<Integer> eachList : lists) {
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }

System.out.println("--List of Sets--------------------------------------------------------------------------");

        List<Set<Integer>> listOfSets = new ArrayList<>();

        listOfSets.add(new LinkedHashSet<>());  // 0
        listOfSets.add(new LinkedHashSet<>());  // 1
        listOfSets.add(new LinkedHashSet<>());  // 2
        listOfSets.add(new LinkedHashSet<>());  // 3

        System.out.println(listOfSets);                          //=>  [[], [], [], []]

        // {10, 5, 20}

        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20));     //=>[[10, 5, 20], [], [], []]
        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20));     //=>[[10, 5, 20], [], [], []] Sets don't accept duplicates

        listOfSets.get(1).addAll(Arrays.asList(30, 15, 30));    //adding elements to the set at index # 1
        listOfSets.get(2).addAll(Arrays.asList(300, 150, 40));  //adding elements to the set at index # 2
        listOfSets.get(3).addAll(Arrays.asList(30000, 1, 5));   //adding elements to the set at index # 3

        System.out.println(listOfSets);                         //=>[[10, 5, 20], [30, 15], [300, 150, 40], [30000, 1, 5]]


    }

}