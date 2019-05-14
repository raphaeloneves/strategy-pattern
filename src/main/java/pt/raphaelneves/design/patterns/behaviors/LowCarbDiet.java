package pt.raphaelneves.design.patterns.behaviors;

public class LowCarbDiet implements EatBehavior {
    public void eat() {
        System.out.println("I need to loose some wight eating less carbo!");
    }
}
