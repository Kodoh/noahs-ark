package NoahsArk.Concrete;

import NoahsArk.AquaticMammal;
import NoahsArk.Mammal;

public class Whale extends AquaticMammal implements Mammal {

    public Whale() {
        super("Whale");
    }
    @Override
    public void makeSound() {
        System.out.println("Click, whistle");
    }
}
