package day26_statics;

public class CarTestUO {
    public static void main(String[] args) {

        Car c1 = new Car("Honda");
        Car c2 = new Car("Mer", "C1");
        Car c3 = new Car("VW", "Jetta", 1989);
        Car c4 = new Car("BMW", "Coupe", 2025, 2500000);
        Car c5 = new Car("Reno", "Broad", 2030, 2000, "Red");

        System.out.println("---------------------------------------------------------------");
        System.out.println(c1);       //Car{make='Honda', model='null', year=0, price=0.0, color='null'}
        System.out.println("---------------------------------------------------------------");
        System.out.println(c2);       //Car{make='Mer', model='C1', year=0, price=0.0, color='null'}
        System.out.println("---------------------------------------------------------------");
        System.out.println(c3);       //Car{make='VW', model='Jetta', year=1989, price=0.0, color='null'}
        System.out.println("---------------------------------------------------------------");
        System.out.println(c4);       //Car{make='BMW', model='Coupe', year=2025, price=2500000.0, color='null'}
        System.out.println("---------------------------------------------------------------");
        System.out.println(c5);       //Car{make='Reno', model='Broad', year=2030, price=2000.0, color='null'}
    }
}