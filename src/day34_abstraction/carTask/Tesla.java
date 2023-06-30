package day34_abstraction.carTask;

public class Tesla extends Car {

    public Tesla(String model,String color, int year, double price){
        super(model,color, year,price);
    }

    public void start(){
        System.out.println("Just say start my "+getColor()+" "+getModel());
    }
    public void autoPilot(){
        System.out.println("To have an autopilot first you have to have "+getMake()+" "+getModel());
    }

}

/*
Create the following sub classes of Car

			Tesla extra methods:autoPilot()

 */