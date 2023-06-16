package day28_encapsulation.personTask;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Mohammad");
        Person person2 = new Person("Abidullah", 'M');
        Person person3 = new Person("Hasan", 30);
        Person person4 = new Person("Daniel", "English");
        Person person5 = new Person("Tatiana", 25, 'F');
        Person person6 = new Person("Lucy", 31, 'F', "English");

        System.out.println(person1); //Person{name='Mohammad', age=0, gender= , language='null', planet='Earth'}
        System.out.println(person2); //Person{name='Abidullah', age=0, gender=M, language='null', planet='Earth'}
        System.out.println(person3); //Person{name='Hasan', age=30, gender= , language='null', planet='Earth'}
        System.out.println(person4); //Person{name='Daniel', age=0, gender= , language='English', planet='Earth'}
        System.out.println(person5); //Person{name='Tatiana', age=25, gender=F, language='null', planet='Earth'}
        System.out.println(person6); //Person{name='Lucy', age=31, gender=F, language='English', planet='Earth'}

//Since planet is static, the value is always "Earth"
    }
}
