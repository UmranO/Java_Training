package day41_maps;
import java.util.Map;
import java.util.LinkedHashMap;

public class MapPractice {
    public static void main(String [] args){

        Map<String, Object>  person1 = new LinkedHashMap<>();    //We go with Object for the Ref. Type of the values
                                                                 //so that it can cover a varity of data.If we want to
        person1.put("name", "Arthur");                           //keep the insertion order we create a LinkedHashMap
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("married", true);

        System.out.println(person1);
        // Console: =>{name=Arthur, gender=M, age=32, job_title=Developer, salary=100000.5, married=true}

        //keys act as the index#s. So to get the name of the Person, we have to call the get() & give the key "name"
        System.out.println( person1.get("name") );                 //=>Arthur
        System.out.println(person1.get("salary"));                 //=>100000.5
        System.out.println(person1.get("job_title"));              //=>Developer

    }
}
