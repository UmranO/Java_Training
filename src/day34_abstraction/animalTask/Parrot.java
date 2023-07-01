package day34_abstraction.animalTask;

public class Parrot extends Animal implements Playable, Flyable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Parrot "+getName()+" is eating seeds");
    }
    public void play(){
        System.out.println(getName()+" is a "+getBreed()+" which loves playing");
    }
    public void fly(){
        System.out.println(getGender()+ " is not a determining factor for how fast a bird can fly");
    }
}
