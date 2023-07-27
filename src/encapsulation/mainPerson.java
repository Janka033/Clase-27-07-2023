package encapsulation;

import javax.swing.*;

public class mainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName(JOptionPane.showInputDialog("Enter the name"));
       System.out.println(person.getName());
       person.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter the age")));
       System.out.println(person.getAge());




        //person.setName("Janka");
        //System.out.println(person.getName());
        //person.setAge(19);
        //System.out.println(person.getAge());

        //Person person1 = new Person();
        //person1.name = "PEPE";
       // System.out.println(person1.name);
    }
}
