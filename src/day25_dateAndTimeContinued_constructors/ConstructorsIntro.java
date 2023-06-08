package day25_dateAndTimeContinued_constructors;

public class ConstructorsIntro {

    public ConstructorsIntro(){
        System.out.println("Object is created by using no argument constructor");  //Can have more than 1 constructor
    }                                                                              //bec of method overloading

    public ConstructorsIntro(int a){
        System.out.println("Object is created by using int argument constructor");
    }


    public void add(){              //Not a constructor bec.it has a return type & the name isn't same as the Class name

    }


    public static void main(String[] args) {

        ConstructorsIntro  obj1 = new ConstructorsIntro(10);

        ConstructorsIntro  obj2 = new ConstructorsIntro();

      //ConstructorsIntro obj3 = new ConstructorsIntro("Java");      //It'll give compile error bec. we don't have a
                                                                     //constructor with a String Argument

    }

}
