package day29_inheritance.animalTask;

public class Dog extends Animal{                            //Dog is an Animal. Is a child class of Animal Class
           //Child      //Parent



    public void bark() {                                   //Unique() of Dog Class so we have to declare it here since
        System.out.println(getName() + " is barking");     //it wasn't present in the Animal Class/inherited from A.Class
    }
}

//After Dog inherited (extended) Animal Class all the variables and methods of the Animal Class are also the member of
//the Dog Class. Even though invisible in the Dog CLass we have 7 variables + 5 methods inherited from Animal Class. So
//what that means is that when you create the Dog object you can call all the instances you defined in the Animal Class
//which is also present in the Dog Class.
/*
    public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        setInfo();
        eat();
        drink();
        sleep();
        toString();
        bark();
    }
    */
