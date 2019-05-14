package pt.raphaelneves.design.patterns.models;

import pt.raphaelneves.design.patterns.behaviors.BarkBehavior;
import pt.raphaelneves.design.patterns.behaviors.EatBehavior;

public abstract class Dog {
    protected BarkBehavior barkBehavior;
    protected EatBehavior eatBehavior;

    public void setBarkBehavior(final BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }

    public void setEatBehavior(final EatBehavior eatBehavior) {
        this.eatBehavior = eatBehavior;
    }

    public void bark() {
        barkBehavior.bark();
    }

    public void eat() {
        eatBehavior.eat();
    }
}
