package NoahsArk.Concrete;

import NoahsArk.AquaticNonMammal;
import NoahsArk.NonMammal;

public class Frog extends AquaticNonMammal implements NonMammal {

    public Frog() {
        super("Frog");
    }
    @Override
    public void makeSound() {
        System.out.println("Ribbit");
    }
}
