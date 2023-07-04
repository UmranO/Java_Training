package day35_polymorphism;
import day34_abstraction.animalTask.*;
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

    }
}