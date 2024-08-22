package day42_maps;
import java.util.Arrays;
import java.util.Map;
import java.util.LinkedHashMap;
import java.time.LocalDate;

public class MapPractice3 {
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

        //If we want to store the above 5 maps into an Array the data type should be Map and the Map's key and value's
        //data type in order to contain the above Map object? - String & Object. In order to declare it as An Array we
        //give[]. Since we want to store 5 Map objects we can instantiate the size of the Array to 5.

        Map<String, Object>[] arrayOfMap = new Map[5];                               // index: 0 ~ 4
        System.out.println(Arrays.toString(arrayOfMap));                             // =>[null, null, null, null, null]

        arrayOfMap[0] = person1;
        arrayOfMap[1] = person2;
        arrayOfMap[2] = person3;
        arrayOfMap[3] = person4;
        arrayOfMap[4] = person5;
        //arrayOfMap[5] = new LinkedHashMap<>();   //results in ArrayIndexOutOfBound Excep bec Array size is fixed and 5

        System.out.println(Arrays.toString(arrayOfMap));

System.out.println("--Increase the salary of the 2nd person by 10,000-----");//---------------------------------------

        arrayOfMap[1].replace("salary", ( (Integer)arrayOfMap[1].get("salary") ) + 10000);
        //To be able to add 10000, since return type of get("salary") is Object it has to be Casted to Integer
        System.out.println(arrayOfMap[1]);

System.out.println("--Increase the salary of the 2nd person by 33 to see that replace() returns the old value------");

        System.out.println(arrayOfMap[1].replace("salary", ( (Integer)arrayOfMap[1].get("salary") ) + 33));  //=> 100000

        System.out.println("****");

        System.out.println(arrayOfMap[1]);                                                //=> the updated map (person2)

System.out.println("--Change the 1st person's name from to Hasan-----------------------------------------------------");

        arrayOfMap[0].replace("name","Hasan");
        System.out.println(arrayOfMap[0]);
        System.out.println("****");
        System.out.println(Arrays.toString(arrayOfMap));

System.out.println("--to Iterate the Array of Maps-------------------------------------------------------------------");

        for(Map<String, Object> eachMap: arrayOfMap){
            System.out.println(eachMap);
        }
System.out.println("--How many people are making less than 10000-----------------------------------------------------");

System.out.println("--M Way------------------------------------------------------------------------------------------");
    }
}
