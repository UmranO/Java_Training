package day28_encapsulation.personTask;

public class TestPersonUO {
    public static void main(String[] args){

        PersonUO p1=new PersonUO("Umran");
        PersonUO p2=new PersonUO("Ozlem", 89);
        PersonUO p3=new PersonUO("Kemal","English");
        PersonUO p4=new PersonUO("Ahmet",'M');
        PersonUO p5=new PersonUO("Metem",17,'M');
        PersonUO p6=new PersonUO("Seyda",18,'F',"French");

        PersonUO.printPlanet();
        p1.pDrink("Coke");
        p2.pFood("Burger");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

    }
}
