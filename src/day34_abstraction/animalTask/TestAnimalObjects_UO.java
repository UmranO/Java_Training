package day34_abstraction.animalTask;

public class TestAnimalObjects_UO {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("");
        Cat c=new Cat("Mirnav", "Van",'F',3,"Medium", "White");
        Dog d=new Dog("Ash", "Golden",'M',7,"Large", "Brown");
        Dolphin dol=new Dolphin("Dolly", "ooo",'F',9,"Small", "Gray");
        Duck duc=new Duck("Holly", "Govel",'M',8,"Medium", "Green");
        Eagle e=new Eagle("Earl", "ttt",'F',3,"Large", "White");
        Lion l=new Lion("Leo", "Asian",'M',6,"Small", "Yellow");
        Parrot p=new Parrot("Firildak", "Rio",'F',4,"Medium", "Red");
        Shark s=new Shark("Sharky", "Dog",'M',1,"Large", "Gray");
        Tiger t=new Tiger("Tigi", "African",'F',2,"Small", "Patterned");

        System.out.println(c);
        System.out.println(d);
        System.out.println(dol);
        System.out.println(duc);
        System.out.println(e);
        System.out.println(l);
        System.out.println(p);
        System.out.println(t);

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("");
        c.eat();
        c.play();
        d.eat();
        d.play();
        d.bark();
        d.swim();
        dol.eat();
        dol.play();
        dol.swim();
        dol.drink();
        duc.eat();
        duc.play();
        duc.swim();
        duc.fly();
        e.eat();
        e.fly();
        e.hunt();
       l.eat();
       l.hunt();
       p.eat();
       p.play();
       p.fly();
       t.eat();
       t.hunt();


    }
}
