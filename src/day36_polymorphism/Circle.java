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

//--UOS-Her yarattigimiz custom class'da Object Class'in metodlarini bu custom class icin uyarliyoruz.eg toString,equals

//--toString()---UOS-eg burada shortcut'tan generate ettigin bile orjinalinden farkli-----------------------------------
        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    ", area=" + area() +
                    ", perimeter=" + area() +
                    '}';
        }

//--equals()---Burada instance variable'larini set ettigimiz circle'la argument olarak verilen circle'u compare ediyoruz
// .equals()

        @Override
        public boolean equals(Object obj) {

            if( !(obj instanceof Circle) ){                  //if the specified object is not circle, then we should not
                System.err.println("Invalid Object");        //compare them
                System.exit(1);
            }

            if( this.radius ==  ( (Circle)obj ).radius ){   //if the current circle's radius is equal to the given
                return true;                                //circle's radius, then two circles are equal
            }

            return false;                                   //Burada argument'in cicle oldugunu biliyoruz ama radius'lari
        }                                                   //esit olmadigi icin equal degiller diyoruz.




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
