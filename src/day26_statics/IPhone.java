package day26_statics;

public class IPhone {

    public String model, color;                   //instance: different models for iphone objects
    public double price;

    public static String brand="Apple";           //Since all Iphones are Apple brand it should be static. Since
                                                  //it is static we can initialize it in the Class,no need for object
    public static String OS="iOS";                //Since all the Operating System of Iphones are the same
                                                  //OS should be static
    public static String madeIn="China";          //Since all the IPhones are made in China it is static

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean isExpensiveToFix = true;


    public IPhone(String model,String color,double price ){
        this.model=model;
        this.color=color;
        this.price=price;
    }

}
/*
Attributes:
    brand, model, color, price, OS, madeIn, hasBattery, isTouchScreen, isExpensiveToFix
 */