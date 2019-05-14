package pt.raphaelneves.design.patterns;

import pt.raphaelneves.design.patterns.models.Bulldog;
import pt.raphaelneves.design.patterns.models.Dog;
import pt.raphaelneves.design.patterns.models.GermanShepherd;
import pt.raphaelneves.design.patterns.models.Labrador;

public class DogSimulator {
    public static void main(String[] args) {
        System.out.println("Labrador");
        Dog labrador = new Labrador();
        labrador.bark();
        labrador.eat();

        System.out.println("German Shepherd");
        Dog germanShepherd = new GermanShepherd();
        germanShepherd.bark();
        germanShepherd.eat();

        System.out.println("Bulldog");
        Dog bulldog = new Bulldog();
        bulldog.bark();
        bulldog.eat();


    }
}
