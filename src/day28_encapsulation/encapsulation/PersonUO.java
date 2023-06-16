package day28_encapsulation.encapsulation;

public class PersonUO {
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;

    public PersonUO(String name){
        this.name=name;
    }
    public PersonUO(String name, int age){                        //Cons. call ederken cagirdiginin parametresini pass
        this(name);                                               //ediyorsun ()'da sonra da this() icinde arg.'i yaziyorsun
        this.age=age;
    }
    public PersonUO(String name, String language){
        this(name);
        this.language=language;
    }
    public PersonUO(String name, char gender){
        this(name);
        this.gender=gender;
    }
    public PersonUO(String name,int age,char gender){
        this(name, age);
        this.gender=gender;
    }
    public PersonUO(String name,int age, char gender, String language){
        this(name,age,gender);
        this.language="English";
    }

    static{                                                      //to set the statics in static block they should have
        planet="Earth";                                          //been declare before the block-Can't be declared &
        isHuman=true;                                            //set at the same time in the static block
        hasNose=true;
        numberOfWings=0;
        numberOfHead=1;
    }

    public static void printPlanet(){                           //Bu class'daki variable'lar disinda bir bilgiye ihtiyac
        System.out.println("Planet name is "+planet);           //yoksa parametreye gerek olmuyor
    }
    public void pFood(String food){
        System.out.println(name+" is eating "+food);
    }
    public void pDrink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public String toString(){
        return "PersonUO {name='"+name+"', age="+age+", gender="+gender+", language='"+language+"'}";
    }

}
/*
Warmup tasks:
	1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()


 */