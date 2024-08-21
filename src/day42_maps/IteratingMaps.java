package day42_maps;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;

public class IteratingMaps {
    public static void main(String[] args){
        Map<String, Integer> map=new LinkedHashMap<>();      // random order, accept null key & null values

        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        System.out.println(map);

System.out.println("---Iterating the map by the keys----------------------------------------------------------------");

    for (String eachK: map.keySet()){
    System.out.println(eachK);
}
        System.out.println("-------------------------------------");

        for(String eachKey: map.keySet()){
            map.replace(eachKey,(map.get(eachKey)*2));

        }
        System.out.println(map);

        System.out.println("---Iterating the map by the values-------------------------------------------------------");

        for(Integer eachValue: map.values()){
            System.out.println(eachValue);                  //=> prints each value of the map

        }
        System.out.println(map.values());              //=>[190000, 200000, 170000, 156000, 156000, 196000]

        System.out.println("-------------------------------------");

        //If the max salary is asked: UO
        int max=0;
        for(Integer eachVal : map.values()){

            if (eachVal>max){max=eachVal;}
        }
        System.out.println(max);

 System.out.println("---Iterating the map by the entries/pairs-------------------------------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()){
            System.out.println(eachEntry);                   //=> prints each entry of the map
        }

System.out.println("---If you can get each entry then you can get each key and each value separately:----------------");

        for (Map.Entry<String, Integer> eachEnt : map.entrySet()){
            System.out.println("Key= " +  eachEnt.getKey() + "  Value= "+ eachEnt.getValue());
        }

    }
}