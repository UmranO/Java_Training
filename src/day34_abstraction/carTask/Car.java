package day34_abstraction.carTask;

public abstract class Car {                                                     //Since we have an abstract() in & since
//----variables---------------------------------------------------------------------------------------------------------

    private final String make, model;                                           //we want this class to be a parent and
    private String color;                                                       //don't have intention to create objects
    private final int year;                                                     //from this class it is abstract
    private double price;

//----constructor-------------------------------------------------------------------------------------------------

    public Car(String model, String color, int year, double price){
    this.make=getClass().getSimpleName();                                       //since final we don't have a setter
    this.model=model;                                                           //since final we don't have a setter
    setColor(color);                                                            //since NOt final can be set through the
                                                                                //setters
    if(year<1886){                                                              //since final & don't have a setter
        System.err.println("Year of the car can not be less than 1886 "+year);  //Have to give the conditions in constr.
        System.exit(1);
    }
    this.year=year;

    setPrice(price);
}
//----getters & setters-------------------------------------------------------------------------------------------------

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if(price<=0){
            System.err.println("Price can not be negative or zero "+price);
            System.exit(1);
        }
        this.price=price;
    }
//----common methods----------------------------------------------------------------------------------------------------

    //----final method-------------
    protected final void stop(){                                                   //final() can't be overriden in subclass
        System.out.println("Press the brake.");
    }
    //----abstract method-------------
    protected abstract void start();                                           //abstract() has to be overriden in sub
                                                                               //classes depending on the needs of subc.

//----toString method---------------------------------------------------------------------------------------------------                                                                               //----abstract method-------------

    public String toString(){
        return make+"{model='"+model+"' color"+color+", year="+year+", price=$"+price+"}";
    }

}




/*
	1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Press the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement
 */