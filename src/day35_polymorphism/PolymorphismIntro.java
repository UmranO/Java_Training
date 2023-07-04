package day35_polymorphism;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Tesla;
import day31_inheritance.shape_methodOverriding.Circle;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;

public class PolymorphismIntro {
    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");

        Tiger tiger = null;                            //Bu objectleri create emek yerine kullanabilmek icin null assign
        Eagle eagle = null;                            //etti.
        Lion lion = null;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;

                                                      //To give a class or interface as the referance Type there should
                                                      //be a "Is A Relationship" betw. the Ref.Type & the object Type

        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};  //No C.error bec. all those
                                                                                          //objects are Animal

        //Animal animal = new Tesla("Model Y", "Blue", 2022, 60000);                      =>Since there isn't "IS A"
                                                                                          //relationship between Animal
                                                                                          //and Tesla

        Animal animal = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        animal.eat();                                                                     //Parent type decides what we
        animal.drink();                                                                   //can call in Polymorphism.
        animal.sleep();                                                                   //These are the ()s of Animal

        //animal.play();                                                                  We can't call the object type
        //animal.bark();                                                                  's methods in in Polymorphism.


        System.out.println("---------------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);


    }
}