package day42_maps;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

//--how many female & male employees in the map?------------------------------------------------------------------------
System.out.println("--M Ways------------------------------------------------------------------------------------------");


          int countMaleEmployee = 0;
          int countFemaleEmployees = 0;

      /*  for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployee++;
            }else{
                countFemaleEmployees++;
            }
        }
       */
System.out.println("-----------------------------------------------------------");

        for (String eachValue:employeeMap.values()){
            if (eachValue.equals("F")){countFemaleEmployees++;}
            else {countMaleEmployee++;}        }

        System.out.println("countMaleEmployee = " + countMaleEmployee);
        System.out.println("countFemaleEmployees = " + countFemaleEmployees);

System.out.println("--UO Way----------------------------------------------------------------------------------------");

        int frequencyFemale=(Collections.frequency((employeeMap.values()),"F"));
        int frequencyMale=(Collections.frequency((employeeMap.values()),"M"));
        System.out.println("Number of female employees: "+frequencyFemale+" Number of male employees: " +frequencyMale);

System.out.println("-------------------------------------------------------------------------------------------------");
//--display the names of all the female employees-----------------------------------------------------------------------
System.out.println("--M Ways------------------------------------------------------------------------------------------");

for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
        }

System.out.println("--UO Way----------------------------------------------------------------------------------------");
        for(String name:employeeMap.keySet()){
            if (employeeMap.get(name).equals("F")){System.out.println(name);}
        }
System.out.println("-------------------------------------------------------------------------------------------------");
// update all the "M" values with "Male", "F" values with "Female" ---------------------------------------------------
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else{
                eachEntry.setValue("Female");
            }
        }

        System.out.println(employeeMap);


    }
}
