package day31_inheritance.shape_methodOverriding;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public double getWidth(){
        return width;
    }
    public void setWidth(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }

    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }
    public double area(){
        return width*length;
    }
    public double perimeter(){
        return 2*(width+length);
    }
    public void draw(){
        super.draw();
        System.out.println("* * * * * * * * ");
        for(int i=1; i<=6; i++)
            System.out.println("*             *");
        System.out.println("* * * * * * * * ");
    }

}
