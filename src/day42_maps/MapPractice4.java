package day42_maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.time.LocalDate;

public class MapPractice4 {
    public static void main(String[] args) {
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Front-End Developer");
        person3.put("salary", 90000);
        person3.put("hired_date", LocalDate.of(2022, 9, 15));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Abidullah");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000);
        person4.put("hired_date", LocalDate.of(2021, 8, 15));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Umran");
        person5.put("gender", 'F');
        person5.put("age", 31);
        person5.put("job_title", "Back-end Developer");
        person5.put("salary", 90000);
        person5.put("hired_date", LocalDate.of(2022, 10, 15));
        person5.put("married", true);

        System.out.println("If we want to store the above 5 Maps into another data structure we can store them to another Map" +
                "To do that there should be a pair.If we want them to be the values of the newMap we need to create " +
                "the keys for each of those maps(person1..5) in the newMap");

        Map<Integer, Map<String, Object>> mapOfMaps = new LinkedHashMap<>();
        mapOfMaps.put(0, person1);
        mapOfMaps.put(1, person2);
        mapOfMaps.put(2, person3);
        mapOfMaps.put(3, person4);
        mapOfMaps.put(4, person5);

        System.out.println("If we want to display the 2nd persons info");
        System.out.println(mapOfMaps.get(1));
        //=>{name=Nora, gender=F, age=31, job_title=Back-end Developer, salary=90000, hired_date=2022-08-15, married=true}

        System.out.println("If we want to update the 2nd person's salary to 120K");
        mapOfMaps.get(1).replace("salary", 120000);                        //=>updates 2nd person's salary to 120
        System.out.println(mapOfMaps.get(1).replace("salary", 120000));     //=>returns the old value(90K bec it updated)
        System.out.println(mapOfMaps.get(1));                              //=>{name=Nora, gender=F, age=31, job_title=Back-end Developer, salary=120000, hired_date=2022-08-15, married=true}

        //   mapOfMaps.putAll(Arrays.asList(person1, person2))


        System.out.println("--If we want to iterate every single map of mapOfMap-------------------------------------------");
        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            System.out.println(eachValue);
        }

        System.out.println("--If we want to iterate every single entry of mapOfMap-------------------------------------------");

        for (Map.Entry<Integer, Map<String, Object>> eachMap : mapOfMaps.entrySet()) {
            System.out.println(eachMap);
        }

        System.out.println("--If we want to give raise to everyone 10000----------------------------------------------------");

        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {
                if(eachEntry.getKey().equals("salary")){
                    eachEntry.setValue( (Integer)eachEntry.getValue() + 10000);
                    System.out.println(eachEntry.getValue());
                }
            }
        }
        System.out.println(mapOfMaps.values());
        System.out.println("************************************************************");
        System.out.println(mapOfMaps);

System.out.println("--Key & Value of the Map can be other Maps as well known of Map of Maps--------------------------");

        Map< Map<String, Integer> , Map<String, Integer>> mapOfMaps2 = new LinkedHashMap<>();

System.out.println("--Key & Value of the Map can be any Objects:Collection Object, Array, Custom objects-------------");

        Map<int[], List<Integer>> map2 = new LinkedHashMap<>();


    }
}