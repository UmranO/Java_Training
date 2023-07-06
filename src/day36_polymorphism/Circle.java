package day36_polymorphism;

public class Circle {

        private double radius;
        public final static double PI = 3.14;

        public Circle(double radius) {
            setRadius(radius);
        }
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double area(){
            return radius * radius * PI;
        }

        public double perimeter(){
            return 2 * radius * PI;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    ", area=" + area() +
                    ", perimeter=" + area() +
                    '}';
        }




        /* toString'i anlamak icin

ShortCut'tan Override edilmis hali:

    public String toString() {
        return super.toString();
         }

ShorCut'tan hic bir instance eklenmeden generate edilmis hali

    public String toString() {
        return "Circle{}";
    }
ShorCut'tan instance eklenerek generate edilmis hali

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
 */


}
