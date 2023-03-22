package day18_garbageCollection;

public class Pizza_UO {
        public char size;
        public int numberOfCheeseTopping, getNumberOfPepperoniTopping;

        public void setInfo(char size, int numberOfCheeseTopping, int getNumberOfPepperoniTopping) {
            this.size = size;
            this.numberOfCheeseTopping = numberOfCheeseTopping;
            this.getNumberOfPepperoniTopping = getNumberOfPepperoniTopping;
        }

        public int calCost(){
            int totalPrice=2*(numberOfCheeseTopping+getNumberOfPepperoniTopping);
            return  totalPrice+=(size=='S'||size=='s')? 10 :(size=='M'|| size=='m')? 12 :14;
        }
        public String toString(){
            return "Pizza {size="+size+", quantity of CheeseTopping: "+numberOfCheeseTopping+
                    ", quantity of Pepperoni Topping: "+getNumberOfPepperoniTopping+", pizza cost="+calCost()+"}";
        }
    }
