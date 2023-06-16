package day27_accessModifiers;

public class Circle {
    public static double pi=3.14;
    public double radius;
    public double diameter;

    public Circle(double radius){                           //Less the argument needed better it is
        this.radius=radius;
        diameter=2*radius;
    }

    /*
       public static double calcArea(){                      // static only accepts statics so we can't use instance
           return radius * radius * pi;                      // fields & instance methods. Here only the pi is accepted
       }
       */

    public double calcArea(){
       return radius*radius*pi;
    }

    public double calcPerimeter(){
        return 2*radius*pi;
    }

    public static void printPiValue(){
        System.out.println("PI value is: "+pi);
    }

    public String toString(){
        return "Circle{radius="+radius+", diameter="+diameter+", pi="+pi+", area="+calcArea()
                +", perimeter="+calcPerimeter()+'}';
    }

}
/*
Warmup tasks:
    Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea():      returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi():       displays PI value
			toString():      displays the radius, diameter, pi, area and perimeter of the circle when the object of
			                 circle is passed in the print statement


 */