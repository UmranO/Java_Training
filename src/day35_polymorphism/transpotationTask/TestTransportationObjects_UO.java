package day35_polymorphism.transpotationTask;

public class TestTransportationObjects_UO {
    public static void main(String[] args) {


    Audi audi=new Audi("Audi","Q4","Gray",2023,40000.00);
    Tesla tesla= new Tesla("Tesla1", "T-37", "White", 2025, 700000.00);


        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-----------------------------");

        audi.drive();
        audi.start();
        audi.stop();
        audi.autoPark();

        System.out.println("-----------------------------");

        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.autoPark();

        System.out.println("-----------------------------");

}

}
