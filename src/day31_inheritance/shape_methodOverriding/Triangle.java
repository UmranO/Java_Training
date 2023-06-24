package day31_inheritance.shape_methodOverriding;

public class Triangle extends Shape{

    private double height;
    private double base;

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public Triangle(double height, double base){
        setHeight(height);
        setBase(base);
    }
    public double area(){
        return (base * height /2);
    }
    public double perimeter(){
        return 3*base;
    }
    public void draw(){
        System.out.println("\t*");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        System.out.println("* * * * *");
    }


    @Override
    public String toString() {
        return super.toString().replace((getName() + '\''),(getName() + '\''+ ", base=" +'\''+ base + '\''));
    }
}
/*
 public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
 */