package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Dog;
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

        System.out.println("-------------------------------------------------------------");
        //object type is Nokia But
        //parent type is Phone
        Phone phone = new Nokia("XR20", "Small", "Blue", 350);  //Parent referencing the child
        //there is Upcasting If Upcasting
        //there is also Polymorphism
//----Common methods of the Phone class so we can call it from phone----------------------------------------------------

        phone.call(911);
        phone.text(123456);

//----Unique method of the Nokia class so we can't call it from phone without downcasting it Nokia----------------------

        ((Nokia) phone).selfDefense();

        //((IPhone)phone).faceTime(163456L); We can't call this faceTime() which belongs to the IPhone from phone bec.
        //phone's object is Nokia --It will be a ClassCastException since no "IS A" relationship btw Nokia & IPhone
        //Nokia object can't be converted to the IPhone.






    }
}
