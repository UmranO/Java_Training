package day34_abstraction.animalTask;

public class Cat extends Animal implements Playable{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat(){
        System.out.println("Cat "+getName()+" is eating cat food");
    }

    public void play(){
        System.out.println(getBreed()+" cats are the ones that like to play most.");
    }

}
