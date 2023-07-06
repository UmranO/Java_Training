package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Dog dog=new Dog();                      //Default reference type of new Dog() is Dog
      //Cat cat=new Dog();                      //So you can not assign it to another type if it is not the parent type.

        Animal animal=new Dog();                //implicit casting done automatically

        System.out.println("-----------------------------------------------------");

        Animal animal1 = new Dog();             //upcasting ==> Polymorphism
                                                //since setInfo is present in the Animal we can call it from the object

        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        animal1.eat();                          //since these()s  are present in the Animal we can call from the object
        animal1.drink();
        animal1.sleep();
                                                //since bark()is unique to Dog we can't call it from the object directly
        ((Dog) animal1).bark();                 //down casting is needed

        //  Dog dog1 = (Dog)animal1;            //down casting
        //  dog1.bark();

        //  ( (Cat)animal1).scratch();          //Dog can't be converted to Cat, bec. there is not "IS A" relationship
                                                //between dog and cat






    }
}
