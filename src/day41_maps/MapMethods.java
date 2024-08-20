package day41_maps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapMethods {
    public static void main(String[] args){

        Map<String,String> map = new TreeMap<> ();   //put() is used to adding the key and value into the map as a pair

//-put(key,value)-- is used to adding the key and value into the map as a pair------------------------------------------
               //-- can also be used for updating the values of existing keys

        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

//-size()--counts / returns the # of pairs that are stored in the Map---------------------------------------------------
        System.out.println(map);
        System.out.println( map.size());                                    //=> 9

//-get(key)--returns the value of the specified key---------------------------------------------------------------------
        System.out.println(map.get("A04"));                                 //=> Tatiana
        System.out.println(map.get("B03"));
        System.out.println(map.get("Z"));                                   //If no such a key it'll return you null


  }
}

/*
pair: id - name
I want it to be sorted by id so therefor we can use TreeMap
 */