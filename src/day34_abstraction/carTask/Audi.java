package day34_abstraction.carTask;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
//----Overriden abstract method-----------------------------------------------------------------------------------------

    @Override
    public void start() {
        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }
//----Unique method of Audi---------------------------------------------------------------------------------------------

    public void autoPark(){
        System.out.println(getMake() +" "+getModel() +" has auto park feature");
    }
}
/*
Create the following sub classes of Car

			Audi extra methods:autoPark()

 */