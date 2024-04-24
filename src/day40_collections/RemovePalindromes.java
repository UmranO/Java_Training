package day40_collections;
import utilities.StringUtility;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class RemovePalindromes {
    public static void main (String[] args){
        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver","racecar",
                        "madam")
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

System.out.println("--Remove the palindromes with removeIf + our custom reverse() from StringUtility--------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver",
                "racecar", "madam")
        );

        names2.removeIf(p->p.equalsIgnoreCase(StringUtility.reverse(p)));  //earlier we created a custom reverse()in our
        System.out.println(names2);                                        //StringUtility Class in utilities package


System.out.println("--Remove the palindromes with removeIf + built in StringBuilder's reverse() -------------");
        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver",
                "racecar", "madam")
        );
        names3.removeIf( p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p) );
        System.out.println(names3);
    }
}
