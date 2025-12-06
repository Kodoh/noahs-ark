package NoahsArk.Concrete;

import NoahsArk.AquaticNonMammal;
import NoahsArk.NonMammal;

public class Crocodile extends AquaticNonMammal implements NonMammal {

    public Crocodile() {
        super("Crocodile");
    }
    @Override
    public void makeSound() {
        System.out.println("Snap");
    }
}
