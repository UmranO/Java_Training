package day24_arrayList_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

      //output: [4, 5, 6, 7, 4, 5, 6, 7]
//----M Way-------------------------------------------------------------------------------------------------------------
      list.removeIf(p -> p < 4);              //variable p stands for each element of Collection -> is for Lambda Expres.
      System.out.println(list);            //We can't use regular remove() while iterating a Collection bec index#s
      //will be shifted & the result will be wrong! So we should use removeIf

      System.out.println("--------------------------------------------------");

      ArrayList<String> names = new ArrayList<>();
      names.addAll(Arrays.asList("Java", "Python", "C#", "Java", "Ruby", "JavaScript", "C++", "C"));

      names.removeIf(p -> p.startsWith("J"));    //As soon as we give variable name and write -> compiler knows that
      System.out.println(names);                //it is for each element of this ArrayList names


      System.out.println("--------------------------------------------------");
      //Remove the Employees who are making more than 100000

      ArrayList<Employee> employees = new ArrayList<>();
      employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));


      employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
      employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
      employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
      employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
      employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

      employees.removeIf(p -> p.salary > 100000);
      System.out.println(employees);            //p is referencing each Employee object

      for (Employee each : employees) {
        System.out.println(each.name + " : " + each.salary);
      }

//----UO Way------------------------------------------------------------------------------------------------------------        list.removeAll(Arrays.asList(1,2,3));  //In removeAll() you have to specify all the elements that are less than
      //4 so not practical & if you don't know the elements you can not use removeAll().
      System.out.println(list);

      for (int i = list.size() - 1; i >= 0; i--) {       //Bu da MeteOkul yolu-Sondan basladigi icin index'ler degismedi
        if (list.get(i) < 4) {
          list.remove(list.get(i));
        }
      }
      System.out.println(list);

      System.out.println("------------------------0----------------------");
//"Since the size of Collection is dynamic, it will be a problem using remove() while iterating a Collection.
//The result will be wrong bec. the elems will be shifted after removal of another elem"
      ArrayList<Integer> list2 = new ArrayList<>(); // 0~9
      list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

      System.out.println(list2);

      for (int i = 0; i < list2.size(); i++) {                  //Bunu foreach ile yaptigimda concurrent exception oldu
        if(list2.get(i) < 4){
          list2.remove(i);

        }
      }
      System.out.println(list2);
    }
}


/*
 2. Write a program that can remove the elements that are less than 4, from an ArrayList of integer

          Ex:list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};
          output: [4, 5, 6, 7, 4, 5, 6, 7]


 */

