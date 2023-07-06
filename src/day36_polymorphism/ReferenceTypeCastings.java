package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Dog dog=new Dog();                  ///Default reference type of new Dog() is Dog
      //Cat cat=new Dog();                  //So you can not assign it to another type if it is not the parent type.

        Animal animal=new Dog();            //implicit casting done automatically

        System.out.println("-----------------------------------------------------");


    }
}
