package day25_dateAndTimeContinued_constructors;

public class Rectangle {

    public double length, width;
    public Rectangle(double length, double width) {             //when we have the parameterized constructor compiler
        this.length = length;                                   //doesn't create the default constructor.
        this.width = width;
    }

    /*                                                           setInfo() is not practical when compared with the
    public void setInfo(double length, double width){            constructor bec we have to manually call setInfo every
        this.length = length;                                    time an object is created
        this.width = width;
    }
     */

    public double area(){
        return length * width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +                                //toString() is edited to include area info as well
                '}';
    }


}
