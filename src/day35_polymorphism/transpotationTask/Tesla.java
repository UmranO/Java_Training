package day35_polymorphism.transpotationTask;

public class Tesla extends Car implements Electric, AutoPilot{

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {
        System.out.println("Transporting People");
    }

    @Override
    public void start() {
        System.out.println("start method");
    }


    @Override
    public void autoPark() {
        System.out.println(getMake()+" uses autopark");
    }


    @Override
    public void charge() {
        System.out.println("All electric models of "+getMake()+" need to charge");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" has self drive function");
    }
}

/*
	8. Create a sub class of Car named Tesla that implements AutoPark, AutoPilot and Electric
 */