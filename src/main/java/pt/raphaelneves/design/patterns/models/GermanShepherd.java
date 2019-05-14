package pt.raphaelneves.design.patterns.models;

import pt.raphaelneves.design.patterns.behaviors.PlayfulBark;
import pt.raphaelneves.design.patterns.behaviors.ProteinDiet;

public class GermanShepherd extends Dog {
    public GermanShepherd() {
        eatBehavior = new ProteinDiet();
        barkBehavior = new PlayfulBark();
    }
}
