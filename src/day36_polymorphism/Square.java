package day36_polymorphism;

public class Square {
    private double side;

    public Square(double side){
        this.side=side;
    }
//----M Version---------------------------------------------------------------------------------------------------------
@Override
public boolean equals(Object obj) {

    if( !(obj instanceof Square) ){
        System.err.println("Invalid Object, Object must be square");
        System.exit(1);
    }


    if(side ==  ( (Square)obj ).side ){
        return true;
    }

    return false;
}

//----UO Version--------------------------------------------------------------------------------------------------------
  /*
    public boolean equals(Object obj){
        if(obj instanceof Square){
            if(this.side==(((Square)obj)).side){
                return true;
            }
        }else {
            System.err.println("Invalid object, not a square");
            System.exit(1);
        }return false;
    }

    */
}
