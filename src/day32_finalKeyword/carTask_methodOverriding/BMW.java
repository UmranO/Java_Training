package day32_finalKeyword.carTask_methodOverriding;

public class BMW extends Car{

    public BMW(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Call the mechanic or jump start " + getMake()+" "+getModel());
    }

    }

/*
2. Create the following sub classes and override the start() method if needed:
	Car Class start():  public void start(){
                        System.out.println("Press the brake and twist the key to ignition");
                         }


    BMW  start(): "Call the mechanic or jump start "

 */