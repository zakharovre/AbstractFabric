package coffee;

import additions.Addition;
import factories.AmericanoFactory;
import factories.CoffeeFactory;
import milk.Milk;
import strength.Strength;

public class Americano {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new AmericanoFactory();
        Strength strength = coffeeFactory.chooseStrength();
        Milk milk = coffeeFactory.addMilk();
        Addition addition = coffeeFactory.addAddition();
        strength.chooseStrength();
        milk.chooseMilk();
        addition.chooseAddition();
    }
}
