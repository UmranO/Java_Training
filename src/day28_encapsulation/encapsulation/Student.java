package day28_encapsulation.encapsulation;

public class Student {

  //  public int age;
    private int age;

  //getter
    public int getAge(){
      return age;
    }

  //setter                                  Whatever argument passed to setAge() in the Test Class will be assigned to
    public void setAge(int age){            //the parameter age
      this.age=age;                         //then it will be assigned to the instance variable age
    }




}

