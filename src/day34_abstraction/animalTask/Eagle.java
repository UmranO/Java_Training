package day34_abstraction.animalTask;

public class Eagle extends Animal implements Flyable, WildAnimal{

        public Eagle(String name, String breed, char gender, int age, String size, String color) {
            super(name, breed, gender, age, size, color);
        }

        @Override
        public void eat() {
            System.out.println("Eagle "+getName()+" is eating snake");
        }

        public void fly(){
            System.out.println("Eagles fly low when they hunt");
        }

        public void hunt(){
            System.out.println(getName()+" is hunting");
        }
}
