package day34_abstraction.animalTask;


    public class Dolphin extends Animal implements Playable, Swimmable{
        public Dolphin(String name, String breed, char gender, int age, String size, String color) {
            super(name, breed, gender, age, size, color);
        }

        @Override
        public void eat() {
            System.out.println("Dolphin "+getName()+" is eating fish");
        }

        @Override
        public void play(){
           System.out.println("It is always fun to play with "+getColor()+ " dolphins");
        }

        @Override
        public void swim(){
            System.out.println(getGender()+" and "+getSize()+" dolphins swim faster.");
        }


}
