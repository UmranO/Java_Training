package day42_maps;
import java.util.*;
import java.time.LocalDate;

public class MapPractice2 {
    public static void main(String[] args) {

            Map<String, Object> person1 = new LinkedHashMap<>();
            person1.put("name", "Arthur");
            person1.put("gender", 'M');
            person1.put("age", 32);
            person1.put("job_title", "Developer");
            person1.put("salary", 100000.5);
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

            List<Map<String, Object>> listOfMaps = new ArrayList<>();   //We can store our Maps into an Array or a
                                                                        //Collection type. Since Collection has more ()s
                                                                        //we chose Collection type over Array. Which
            //Collection? Since List has index#s it'll be easier to reach each Map. And since the List is Reference Type
            //& since we don't plan to add or delete but only get or search element what should be the object type?
            //So ArrayList is the best to use here.
            //The type of the List should Map so that we can add Map objects. And the Key and Value type should be same
            //as our Maps (String,Object).List<Map<String, Object>> is called List of Map & can only contain Map objects.
            //Anything that has is A RelationShip with this Map:Map<String, Object> can be stored in this List now

            listOfMaps.add(person1);
            listOfMaps.add(person2);
            listOfMaps.addAll(Arrays.asList(person3, person4, person5 ) );

            System.out.println(listOfMaps);

            System.out.println("---------------------------------------------------");

            for( Map<String, Object> eachMap  :  listOfMaps ){
                    System.out.println(eachMap);
            }
    }
}
