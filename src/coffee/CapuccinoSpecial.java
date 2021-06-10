package coffee;

import additions.Addition;
import factories.CapuccinoSpecialFactory;
import factories.CoffeeFactory;
import milk.Milk;
import strength.Strength;

public class CapuccinoSpecial {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CapuccinoSpecialFactory();
        Strength strength = coffeeFactory.chooseStrength();
        Milk milk = coffeeFactory.addMilk();
        Addition addition = coffeeFactory.addAddition();
        strength.chooseStrength();
        milk.chooseMilk();
        addition.chooseAddition();
    }
}
