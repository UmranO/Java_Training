package day24_arrayList_dateAndTime;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args){

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Ediz", 'M', LocalDate.of(1970, 3, 10));
        people[2].setInfo("Lale",'F',LocalDate.of(2000,11,30));
        people[3].setInfo("Ozlem",'F',LocalDate.of(1965,12,13));
        people[4].setInfo("Kemal", 'M', LocalDate.of(2023, 5, 8));

        ArrayList<Person> studentList=new ArrayList<>();
        studentList.addAll(Arrays.asList(people));

        // print name & date of birth of each person object
        for(Person each:studentList){
            System.out.println(each.name+"\t"+each.dateOfBirth);
        }

        // remove all the person object that has the age > 55
        studentList.removeIf(p->p.age>55);
        System.out.println(studentList);

    }
}
