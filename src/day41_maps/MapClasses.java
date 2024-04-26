package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args){

        Map<String, Integer> hashMap = new HashMap<>();              //random order, accept null key & null values
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();  //insertion order, accepts null key  & null values
        Map<String, Integer> treeMap = new TreeMap<>();       //sorted order,doesn't accept null key,accepts null values
        Map<String, Integer> hashtable = new Hashtable<>();   //random order,doesn't null key & null values,Synchronized
    }
}
