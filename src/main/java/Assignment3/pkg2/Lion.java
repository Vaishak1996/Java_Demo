package Assignment3.pkg2;

import Assignment_3.pkg1.Animal;

public class Lion extends Animal {
    Lion() {
        super("Sherr", 11, "simba", 2);

    }

    public static void main(String[] args) {
        Animal mm = new Lion();
        mm.eat();
        System.out.println(mm.name="sherr");
        //only eat method and name variable to access as its access modifier is public

        }
    }

