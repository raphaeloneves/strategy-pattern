package pt.raphaelneves.design.patterns;

import pt.raphaelneves.design.patterns.behaviors.LazyBark;
import pt.raphaelneves.design.patterns.behaviors.LoudBark;
import pt.raphaelneves.design.patterns.behaviors.NormalDiet;
import pt.raphaelneves.design.patterns.behaviors.PlayfulBark;
import pt.raphaelneves.design.patterns.behaviors.ProteinDiet;
import pt.raphaelneves.design.patterns.models.Dog;
import pt.raphaelneves.design.patterns.models.GermanShepherd;

public class GermanShepherdSimulator {
    public static void main(String[] args) {
        Dog germanShepherd = new GermanShepherd();
        System.out.println("Hello, I'm a German Shepherd named Rex.");
        System.out.println("I love to play with my owner and I call him barking");
        germanShepherd.setBarkBehavior(new PlayfulBark());
        germanShepherd.bark();
        System.out.println("An then he plays the ball with me :)");
        System.out.println("Oh, I just realize that is time to eat. I'm in a growing phase so");
        germanShepherd.setEatBehavior(new ProteinDiet());
        germanShepherd.eat();
        System.out.println("But I guess this is temporary. When I'll be a bigger boy, I probably will enter a");
        germanShepherd.setEatBehavior(new NormalDiet());
        germanShepherd.eat();
        System.out.println("WAIT! I'm seeing a strange person.");
        germanShepherd.setBarkBehavior(new LoudBark());
        germanShepherd.bark();
        System.out.println("Hahahaha I love scaring strangers.");
        System.out.println("It's nap time!!! It was a pleasure to talk to you, human!");
        germanShepherd.setBarkBehavior(new LazyBark());
        germanShepherd.bark();
    }
}
