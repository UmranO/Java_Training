package day40_collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class RemovePalindromes {
    public static void main (String[] args){
        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

System.out.println("--Remove the palindromes with Iterator-----------------------------------------------------------");

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String each = it.next();
            String reverse = "";

            for (int i = each.length()-1; i >= 0 ; i--) {
                reverse += each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse)){
                // names.remove(each);
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("------------------------------------------------------");
    }
}
