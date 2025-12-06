package NoahsArk.Concrete;

import NoahsArk.AquaticMammal;
import NoahsArk.Mammal;

public class Dolphin extends AquaticMammal implements Mammal {

    public Dolphin() {
        super("Dolphin");
    }
    @Override
    public void makeSound() {
        System.out.println("Hiss");
    }
}
