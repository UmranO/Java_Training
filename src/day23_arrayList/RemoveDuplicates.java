package day23_arrayList;
import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        //=> [Vasyl, Vasyl, Sumeye, Sumeye, Ali, Sumeye]
//----M Way-------------------------------------------------------------------------------------------------------------
        System.out.println(names);

        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {

            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }

        // [Vasyl, Sumeye, Ali]

        names = nonDup;

        System.out.println(names);
        System.out.println(nonDup);

//----UO Way------------------------------------------------------------------------------------------------------------
        ArrayList<String > result=new ArrayList<>();

        for(String each:names){
            if(!result.contains(each)){result.add(each);}
        }
        System.out.println("result = " + result);

    }
}
