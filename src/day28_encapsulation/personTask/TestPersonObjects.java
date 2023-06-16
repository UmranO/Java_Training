package day28_encapsulation.personTask;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Mohammad");
        Person person2 = new Person("Abidullah", 'M');
        Person person3 = new Person("Hasan", 30);
        Person person4 = new Person("Daniel", "English");
        Person person5 = new Person("Tatiana", 25, 'F');
        Person person6 = new Person("Lucy", 31, 'F', "English");

        person4.name="James";                       //Since name is instance only the name of person4 will be changed
        //person1.planet="Mars";                    //If we call & change a static variable's value from an object all
                                                    //the copies will be changed bec. static means there is only 1 copy
                                                    //which is shared by all the objects.In whichever object you changed
                                                    //that static variable it's going  to change that same/1 copy so it
                                                    //will be shared by all the objects again-We commented it bec. the
        Person.planet="Mars";                       //proper way of calling the statics is through the Class name


        System.out.println(person1); //Person{name='Mohammad', age=0, gender= , language='null', planet='Earth'}
        System.out.println(person2); //Person{name='Abidullah', age=0, gender=M, language='null', planet='Earth'}
        System.out.println(person3); //Person{name='Hasan', age=30, gender= , language='null', planet='Earth'}
        System.out.println(person4); //Person{name='Daniel', age=0, gender= , language='English', planet='Earth'}
        System.out.println(person5); //Person{name='Tatiana', age=25, gender=F, language='null', planet='Earth'}
        System.out.println(person6); //Person{name='Lucy', age=31, gender=F, language='English', planet='Earth'}

//Since planet is static, the value is always "Earth"
//If by mistake we make the name static the name printed on the console will be Lucy since it was the last to set.

        Person.printPlanetName();

        person1.eat("Baklava");
        person2.drink("Water");
        person5.drink("Tea");
        person6.drink("Coffee");

    }
}
