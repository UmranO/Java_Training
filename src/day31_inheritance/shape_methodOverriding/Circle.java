package day31_inheritance.shape_methodOverriding;

public final class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 6.28 * radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t\t*   *");
        System.out.println("\t *\t\t   *");
        System.out.println("\t*\t\t\t*");
        System.out.println("\t *\t\t   *");
        System.out.println("\t\t*   *");
    }


     public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", radius='" + radius + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

}