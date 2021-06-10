package factories;

import additions.Addition;
import additions.NoAddition;
import strength.MediumCoffee;
import milk.Milk;
import milk.NoMilk;
import strength.Strength;

public class AmericanoFactory implements CoffeeFactory {

    @Override
    public Strength chooseStrength() {
        return new MediumCoffee();
    }

    @Override
    public Milk addMilk() {
        return new NoMilk();
    }

    @Override
    public Addition addAddition() {
        return new NoAddition();
    }
}
