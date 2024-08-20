package day41_maps;
import java.time.LocalDate;
import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

            System.out.println("--HashMap: Random order, accept null key & null values--------------------------------------------");
            //Map<String, Integer> hashMap = new HashMap<>();

            System.out.println("--LinkedHashMap: Insertion order, accepts null key  & null values---------------------------------");
            //Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

            System.out.println("--TreeMap: Sorted order, doesn't accept null key, accepts null values-----------------------------");
            //Map<String, Integer> treeMap = new TreeMap<>();

            System.out.println("--HashTable: Random order, doesn't null key & null values, Synchronized---------------------------");
            //Map<String, Integer> hashtable = new Hashtable<>();


System.out.println("--HashMap: Random order, accept null key & null values--------------------------------------------");
            Map<String, Integer> hashMap=new HashMap<>();

            hashMap.put("Daniel", 95000);
            hashMap.put("Daniel", 95000);    //If you try to add the same key it will not accept it.
            hashMap.put("Emily", 100000);
            hashMap.put("Bella", 85000);
        //  hashMap.put("Daniel", 80000);    If you give different value for the same key then it will keep the last
                                             //given value bec. it will update the value.
            System.out.println(hashMap);     //Console:{Emily=100000, Daniel=95000, Bella=85000}

            hashMap.put("Arron", 78000);     //Order is Random in HashMap. It doesn't keep insertion Order: Even though
                                             //the last pair added was ("Arron", 78000) last one printed is Bella=85000
            System.out.println(hashMap);     //Console:{Emily=100000, Arron=78000, Daniel=95000, Bella=85000}

            hashMap.put("Chris", null);      //null value is accepted in HashMap
            hashMap.put("Breanna", null);    //more than 1 null value can be added in HashMap
            hashMap.put(null, 120000);       //null key is accepted in HashMap
            hashMap.put(null, 110000);       //only 1 null key will be accepted.
            hashMap.put(null, 100000);       //And since this null key is the last one, this will be kept only

            System.out.println(hashMap);
            //Console:{null=100000, Emily=100000, Breanna=null, Chris=null, Arron=78000,Daniel=95000, Bella=85000}

System.out.println("--LinkedHashMap: Insertion order, accepts null key  & null values---------------------------------");
            Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

            linkedHashMap.put("Daniel", 95000);
            linkedHashMap.put("Emily", 100000);
            linkedHashMap.put("Bella", 85000);
            linkedHashMap.put("Arron", 78000);
            linkedHashMap.put("Chris", null);     //null value is accepted in LinkedHashMap
            linkedHashMap.put("Breanna", null);   //more than 1 null value can be added in the LinkedHashMap
            linkedHashMap.put(null, 120000);      //null key is accepted in LinkedHashMap
            linkedHashMap.put(null, 110000);      //only 1 null key will be accepted.
            linkedHashMap.put(null, 100000);      //And since this null key is the last one, this will be kept only

        System.out.println("linkedHashMap = " + linkedHashMap);
 //Console:linkedHashMap = {Daniel=95000, Emily=100000, Bella=85000, Arron=78000, Chris=null, Breanna=null, null=100000}
 //LinkedHashMap it does keep the insertion order. 1st added element will be the 1st element of the LinkedHashMap


System.out.println("--TreeMap: Sorted order, doesn't accept null key, accepts null values-----------------------------");
            Map<String, Integer> treeMap = new TreeMap<>();
            treeMap.put("Daniel", 95000);
            treeMap.put("Emily", 100000);
            treeMap.put("Bella", 85000);
            treeMap.put("Arron", 78000);
            treeMap.put("Chris", null);       //value can be null in treeMap
            treeMap.put("Breanna", null);     //there can be more than 1 null value in the treeMap
          //treeMap.put(null, 120000);          key can not be null in treeMap. It will result in NullPointerException
          //treeMap.put(null, 110000);
          //treeMap.put(null, 100000);

        System.out.println("treeMap = " + treeMap);
        //Console:treeMap = {Arron=78000, Bella=85000, Breanna=null, Chris=null, Daniel=95000, Emily=100000}
        //treeMap it does keep the Sorted Order.

/*
pair: name & salary
Daniel=95000;
Emily=100000;
Bella=85000;
 */


    }
}
