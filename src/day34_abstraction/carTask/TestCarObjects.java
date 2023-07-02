package day34_abstraction.carTask;

public class TestCarObjects {
    public static void main(String[] args) {

        //  Car car1 = new Car("X6", "Red", 2020, 45000);      //It's impossible to create object from an abstract class

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("--------------------------------------------");
        honda.stop();                                         //stop was final so all the outputs will be same for all
        audi.stop();                                          //the subclasses.
        tesla.stop();

        System.out.println("--------------------------------------------");

        honda.start();                                       //start was an abstract method so it'll have diff. outputs
        audi.start();                                        //in each sub class. We have 3 diff. implementations
        tesla.start();

        System.out.println("--------------------------------------------");

        audi.autoPark();                                    //Unique methods of Audi & Tesla
        tesla.autoPilot();

    }
}
