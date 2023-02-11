package day04_concatenation;

public class ShippingAddress {
    public static void main(String[] args){

        String name="Aaron Kissinger";
        String buildingNumber="13621A";
        String streetName="Legacy Circle";
        String city="Fairfax";
        String state="VA";
        String zipCode="22030";
        System.out.println("Your Shipping address is:\n\t"+name+"\n\t"+buildingNumber+" "+streetName+"\n\t"+city+", "+state+" "+zipCode);

        System.out.println("------------------------------------------------------");

        String name1 = "Daniel King";
        String buildingNumber1 = "11862A";
        String streetName1 = "Federalist Way";
        String city1 = "McLean";
        String state1 = "VA";
        String zipCode1 = "20121B";

        System.out.println("Your Shipping address is:");
        System.out.println("\t" + name1);
        System.out.println("\t" + buildingNumber1 + " " + streetName1);
        System.out.println("\t" + city1 + ", " + state1 +" "+zipCode1);

        System.out.println("------------------------------------------------------");

        System.out.println("Your Shipping address is:\n\t" + name1 + "\n\t"
                + buildingNumber1 + " " + streetName1 + "\n\t" + city1 + ", " + state1 +" " + zipCode1);

    }

}
/*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode
Use concatenation to print the full shipping address
	Ex:
	      Your Shipping address is:
                Aaron Kissinger
                13621A Legacy Circle
                Fairfax, VA 22030
 */