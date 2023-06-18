package day28_encapsulation.encapsulation;

import java.util.Locale;

public class Student {

    //  public int age;
    private int age;
    private String name;


    //getter is READ ONLY
    public int getAge() {
        if (age == 0) {
            System.err.println("Age has not bee set");
            System.exit(1);
        }
        return age;
    }

    //setter is WRITE ONLY
    //Whatever argument passed to setAge() in the Test Class will be assigned to
    // public void setAge(int age){            the parameter age
    // this.age=age;                           then it will be assigned to the instance variable age


//If we want to add some conditions before we set the argument to the instance variables

    public void setAge(int age) {

        if (age < -1 || age > 100) {
            System.err.println("Invalid Age: " + age);
            //return;                               is used to exiting the current method
            System.exit(1);                 //is used for exiting the program. If invalid arg. is given program
        }                                         //gets terminated noneof the following code will be executed. It will
        this.age = age;                           //stop there.status code 1 means the program terminated with a problem

    }

    public String getName() {                              //if the name is not set, by default you'll get null. & if
        if (name == null) {                                //null we can't use the methods of String. To assure that the
            System.err.println ("Name is not been set");   //name isn't null we can add a condition in the getter.
            System.exit(1);                          //Since null bir String olmadigi icin null== ile yazdik)
        }
        return name;
    }



    public void setName(String name){

      boolean hasDigit=false;

      for(char each:name.toCharArray()){
           if (Character.isDigit(each)){
              hasDigit=true;
              break;
       }
        if(hasDigit=true){
          System.err.println("Invalid name "+name);
          System.exit(1);}
     }

      this.name=name;
    }


}

