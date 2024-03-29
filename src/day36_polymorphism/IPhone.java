package day36_polymorphism;
import java.util.Arrays;

public class IPhone {

    private String brand, model, size, color;
    private double price;

    public IPhone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink", "Blue", "Red", "Gray"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        } else {
            System.err.println("Invalid color: " + color + "\n color of the can only be : " + Arrays.toString(colors));
            System.exit(1);
        }
    }

    public void call(long phoneNumber) {
        System.out.println(getModel() + " is calling " + phoneNumber);
    }


    public void text(long phoneNumber) {
        System.out.println(getModel() + " is texting to " + phoneNumber);
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if( !(obj instanceof IPhone)){                                   //if the given object is not Iphone
            System.err.println("Invalid object, Object must be Iphone");
            System.exit(1);
        }
        if( model.equals(  ( (IPhone)obj ).model ) ){                    //if the model of the Iphone is equal to the
                                                                         //given Iphone's model
            if(color.equals( ( (IPhone)obj ).color  )   ){               //if the color of the Iphone is equal to the
                                                                         //given iphone's color
                return true;        }                                    //hem model hem renk ayni ise return true
        }

        return false;                                                    //hem model hem renk ayni degilse return false
    }
    /*
//----equals()--M's ilk Way--Bunda farekli parametre olarak farkli object verirsek programi terminate etmiyor-----------
    @Override
    public boolean equals(Object obj){                     //Be careful Reference Type is parent type(Object)
        if(obj instanceof IPhone){                         //if the given object is IPhone
            if (model.equals(((IPhone)obj).model)){        //if the model of the IPhone is equal to given IPhone's model
                if (color.equals(((IPhone) obj).color)){   //if the color of the IPhone is equal to given IPhone's color
                    return true;
                }
            }
        }
        return false;
    }



----equals()--UO Way--------------------------------------------------------------------------------------------------
    public boolean equals(Object obj){
        if(!(obj  instanceof IPhone)){
            System.err.println("It is not an IPhone object");
            System.exit(1);
        }
        if((model.equals(((IPhone)obj).model))&&((color.equals(((IPhone)obj).color)))){
            return true;
        }
        return false;
    }
//----equals()--UO 2nd Way----------------------------------------------------------------------------------------------
public boolean equals(Object obj) {
    if (obj instanceof IPhone) {                                                           //PreCondition
        if ((model.equals(((IPhone) obj).model)) && color.equals(((IPhone) obj).color)) {  //Checking the additional
            return true;                                                                   //Hepsi dogru ise
        }
    } else {System.err.println("Invalid object");  System.exit(1);}                  //Precondition not met

    return false;                                                   //Precondition dogru ama digerleri dogru degilse
}
*/
}



