package day41_maps;
import java.time.LocalDate;
import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

            System.out.println("--HashMap: Random order, accept null key & null values--------------------------------------------");
            Map<String, Integer> hashMap = new HashMap<>();


            System.out.println("--LinkedHashMap: Insertion order, accepts null key  & null values---------------------------------");
            Map<String, Integer> linkedHashMap = new LinkedHashMap<>();


            System.out.println("--TreeMap: Sorted order, doesn't accept null key, accepts null values-----------------------------");
            Map<String, Integer> treeMap = new TreeMap<>();


            System.out.println("--HashTable: Random order, doesn't null key & null values, Synchronized---------------------------");
            Map<String, Integer> hashtable = new Hashtable<>();


System.out.println("--HashMap: Random order, accept null key & null values--------------------------------------------");
            Map<String, Integer> hashmap=new HashMap<>();
            hashMap.put("Daniel", 95000);
            hashMap.put("Daniel", 95000);    //If you try to add the same key it will not accept it. If you give
            hashMap.put("Emily", 100000);    // different value for the same key then it will keep the last given value
            hashMap.put("Bella", 85000);     //bec. it will update the value.
            hashMap.put("Daniel", 95000);
            System.out.println(hashMap);     //Console:{Emily=100000, Daniel=95000, Bella=85000}
/*
Daniel=95000;
Emily=100000;
Bella=85000;
 */


    }
}
