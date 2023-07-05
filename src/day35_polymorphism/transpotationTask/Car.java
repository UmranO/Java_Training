package day35_polymorphism.transpotationTask;

public abstract class Car extends Transportation{

    public Car( String make,String model, String color, int year, double price) {
        super(make, model, color, year, price);                            //Burada getMake ile Class ismini alamadik.
    }                                                                      //M Car abstract oldugu icin dedi.Sonra Tesla
                                                                           //Class'da yapariz dedi. Fakat denedim baska
    public void drive(){                                                   //metod'da getMake calisiyor. So net degil.
        System.out.println("Driving "+getMake()+" "+getModel());
    }

}

/*
5. Create an abstract sub class of Transpotation named Car

				extra methods:
					drive()


 */