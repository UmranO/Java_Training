package day28_encapsulation.encapsulation;

import java.nio.charset.StandardCharsets;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.setSalary(100);
        System.out.println(employee1.getSalary());

        employee1.setName("      ");                           //Since the arg given only contains space -so it is blank
        System.out.println(employee1.getName());
    }
}
