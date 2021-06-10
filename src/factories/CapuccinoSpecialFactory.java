package factories;

import additions.Addition;
import additions.Cinnamon;
import milk.HotMilk;
import milk.Milk;
import strength.LightCoffee;
import strength.Strength;

public class CapuccinoSpecialFactory implements CoffeeFactory{
    @Override
    public Strength chooseStrength() {
        return new LightCoffee();
    }

    @Override
    public Milk addMilk() {
        return new HotMilk();
    }

    @Override
    public Addition addAddition() {
        return new Cinnamon();
    }
}
