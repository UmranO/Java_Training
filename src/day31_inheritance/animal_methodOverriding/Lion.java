package day31_inheritance.animal_methodOverriding;

public class Lion extends Animal {

    private boolean isAfricanLion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }
    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

//    @Override                                 This is the output of the shortcut of Intellij to override a ()
//    public void eat() {
//        super.eat();                          This is calling the parent class's eat() it will give the same output
//   }                                          so we need to override to have the Lion's implementation

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating deer");
    }


    public void roar(){
        System.out.println("Lion "+getName()+" is roaring");
    }


    @Override
    public String toString() {
        return  super.toString().replace("}", "") +
                ", African lion='" + isAfricanLion + '\'' +
                '}';
    }

}
