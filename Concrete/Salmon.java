package NoahsArk.Concrete;

import NoahsArk.AquaticNonMammal;
import NoahsArk.NonMammal;

public class Salmon extends AquaticNonMammal implements NonMammal {

    public Salmon() {
        super("Salmon");
    }
    @Override
    public void makeSound() {
        System.out.println("Bubble");
    }
}
