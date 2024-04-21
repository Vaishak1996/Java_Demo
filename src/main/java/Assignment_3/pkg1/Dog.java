package Assignment_3.pkg1;

import org.checkerframework.checker.units.qual.A;

public class Dog extends Animal {
    Dog() {

        super("Ll", 100, "Cuu", 1);
    }

    public static void main(String[] args) {
        Animal abb = new Dog();
        System.out.println(abb.name);
        abb.walk();
        abb.details();
        abb.eat();
        //abb.gender();//unable to access as it is private

    }
}