package day34_abstraction.animalTask;

public class Dog extends Animal implements Playable, Swimmable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+ getName() +" is eating dog food");
    }

    public void play(){
        System.out.println(getSize()+ " "+getBreed()+ " of the dogs determine if the dod likes to play.");
    }

    public void swim(){
        System.out.println("All the dogs like swimming");
    }

    public void bark(){  System.out.println(getName() +" is barking");}
}
