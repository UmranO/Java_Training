package day32_finalKeyword.carTask_methodOverriding;

public class Car {

//--Instance Variables:  make, model, color, year, price, numberOfWheels (static), hasBattery (static)------------------

    private String make, model, color;
    private int year;
    private double price;

//--Static Variables: numberOfWheels (static), hasBattery (static)------------------------------------------------------

    public static int numberOfWheels;
    public static boolean hasBattery;


    static{
        numberOfWheels=4;
        hasBattery=true;
    }

//--Encapsulate all the fields------------------------------------------------------------------------------------------
//    Condition:
//    1. year can not be negative or zero
//    2. price can not be negative or zero

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <= 0 ){                                                          //if specified year is negative or zero
            System.err.println("Invalid year: "+year);
            System.exit(1);                                               //terminates the program
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){                                                         //if specified price is negative or zero
            System.err.println("Invalid price: "+price);
            System.exit(1);                                              //terminates the program
        }
        this.price = price;
    }

//--Add a constructor that can set all the fields-----------------------------------------------------------------------
//    note: make of the car can be set to the class name

    public Car(String model, String color, int year, double price) {
        setMake( getClass().getSimpleName() );                              //setting the class name to make of the car
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }
//--Methods:------------------------------------------------------------------------------------------------------------
//    start(): "Press the brake and twist the key to ignition"
//    toString()
    public void start(){
        System.out.println("Press the brake and twist the key to ignition to start "+make+" "+model);
}

    @Override
    public String toString() {                                              //Since we made sure the class name will be
        return make+"{" +                                                   //set to the make in the setter here we can
                "model='" + model + '\'' +                                  //directly write make
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", wheels=" + numberOfWheels +                              //If we want we can also add a static
                '}';                                                        //variable when we override
    }


}
/*
Warmup tasks:
	1. Create a class named Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)

            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero

            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name

            Methods:
                start(): "Press the brake and twist the key to ignition"

                toString()


	2. Create the following sub classes and override the start() method if needed:

            1. Toyota
                	start(): "Press the brake and twist the key to ignition"

            2. Honda
                    start(): "Press the brake and twist the key to ignition"

            3. Audi
                	start(): "Press the start button"

            4. BMW
                	start(): "Call the mechanic or jump start "

            5. Tesla
               		start(): "Say \"Start\""

	                Extra method:
	                	  autoPilot()


	                Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k

 */