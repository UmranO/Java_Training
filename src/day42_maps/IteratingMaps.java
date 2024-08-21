package day42_maps;
import java.util.Map;
import java.util.LinkedHashMap;

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
    }


}
