package day41_maps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapMethods {
    public static void main(String[] args){

        Map<String,String> map = new TreeMap<> ();   //put() is used to adding the key and value into the map as a pair

//-put(key,value)-- is used to adding the key and value into the map as a pair------------------------------------------
               //-- can also be used for updating the values of existing keys but the repalce() is faster bec it doesn't
               //--have the intention to insert

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

//-replace(key,newValue)--replaces the value of the specified key with the new value------------------------------------

        map.replace("C02", "Aseel");
        map.replace("A07", "Marika");
        System.out.println(map);

//-remove(key)--removes a pair with the matching key from the Map-----------------------------------------------------
        map.remove("A05");
        System.out.println(map);

//-containsKey(key)--returns true if the specified key is included in the Map, otherwise returns false------------------
        System.out.println(map.containsKey("B03"));                       // =>true
        System.out.println( map.containsKey("H98"));                      // =>false

//-containsValue(value)--returns true if the specified value is included in the Map, otherwise returns false------------
        System.out.println(map.containsValue("Lucy"));                    // =>false
        System.out.println(map.containsValue("Muhtar"));                  // =>false


  }
}

/*
pair: id - name
I want it to be sorted by id so therefor we can use TreeMap
 */