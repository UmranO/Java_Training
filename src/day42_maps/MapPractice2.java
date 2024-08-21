package day42_maps;
import java.util.Map;
import java.util.LinkedHashMap;
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

        System.out.println(person1);


        }
}
