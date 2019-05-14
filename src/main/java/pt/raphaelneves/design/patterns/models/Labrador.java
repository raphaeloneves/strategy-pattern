package pt.raphaelneves.design.patterns.models;

import pt.raphaelneves.design.patterns.behaviors.NormalDiet;
import pt.raphaelneves.design.patterns.behaviors.PlayfulBark;

public class Labrador extends Dog {
    public Labrador() {
        barkBehavior = new PlayfulBark();
        eatBehavior = new NormalDiet();
    }
}
