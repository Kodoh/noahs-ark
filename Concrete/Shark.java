package NoahsArk.Concrete;

import NoahsArk.AquaticMammal;
import NoahsArk.Mammal;

public class Shark extends AquaticMammal  implements Mammal {
    public Shark() {
        super("Shark");
    }

    @Override
    public void makeSound() {
        System.out.println("Bite");
    }
}
