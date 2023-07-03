package day35_polymorphism.transpotationTask;

public class Audi extends Car implements AutoPark {
    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {
        System.out.println(getModel()+" is a vehicle to transport people");
    }

    @Override
    public void start() {
        System.out.println("To start "+getMake()+" do press the button");
    }

    @Override
    public void autoPark() {
        System.out.println(getYear()+" "+getModel()+" has autopark function");
    }
}

/*
    7. Create a sub class of car named Audi that implements AutoPark




 */