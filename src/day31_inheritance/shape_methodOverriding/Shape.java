package day31_inheritance.shape_methodOverriding;

public class Shape {

//----instance variable------------------------------------------------------------------------------------------------

    private String name;

//----constructor------------------------------------------------------------------------------------------------------

    public Shape(){                                         //This way we can set the name without asking for any arg.
        setName(getClass().getSimpleName());
    }
//----setters-----------------------------------------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//----common methods----------------------------------------------------------------------------------------------------

    public double area(){                                   //We made it a return() so that we can reuse the area
        return 0;                                           //Since there isn't a one for all formula that can fit all
    }                                                       //the shapes so here we give a default value that needs to
                                                            //be returned from this are(). eg we can set it to 0 now &
    public double perimeter(){                              //change it later in the child classes depending on each of
        return 0;                                           //its need.
    }

    public void draw(){
        System.out.println("Drawing a "+getClass().getSimpleName()+": ");
    }

//----toString()--------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}
