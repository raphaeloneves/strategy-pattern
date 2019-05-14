package pt.raphaelneves.design.patterns.models;

import pt.raphaelneves.design.patterns.behaviors.LazyBark;
import pt.raphaelneves.design.patterns.behaviors.LowCarbDiet;

public class Bulldog extends Dog {
    public Bulldog() {
        eatBehavior = new LowCarbDiet();
        barkBehavior = new LazyBark();
    }
}
