package day35_polymorphism;
import day34_abstraction.animalTask.*;
import day35_polymorphism.transpotationTask.*;


public class PolymorphismPractice {
    public static void main(String[] args){

        Animal tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //tiger.hunt();                                           //We don't have the hunt() in the Animal so can't call

        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        //animal.fly();                                          //Since fly() isn't present in Animal, we can't call it
        animal.eat();
        animal.sleep();
        animal.drink();                                          //We can call eat,drink& sleep bec we've them in Animal

        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        //obj1.eat();
        // obj1.drink();
        // obj1.sleep();
        obj1.fly();
        System.out.println(obj1.canFly);
        Lion lion = null;

        Parrot parrot = null;
        Shark shark = null;
        Dolphin dolphin = null;
        Eagle eagle = null;
        Duck duck = null;
        Dog dog = null;
        Cat cat = null;
        CydeoCar cydeoCar = null;

        Flyable[] birds = { parrot, eagle, duck};


    }

}
