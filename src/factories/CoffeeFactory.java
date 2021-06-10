package factories;

import additions.Addition;
import milk.Milk;
import strength.Strength;

public interface CoffeeFactory {
    Strength chooseStrength();
    Milk addMilk();
    Addition addAddition();
}
