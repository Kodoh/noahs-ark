package NoahsArk.Concrete;

import NoahsArk.FlyingNonMammal;
import NoahsArk.NonMammal;

public class Owl extends FlyingNonMammal implements NonMammal {

    public Owl() {
        super("Owl");
    }
    @Override
    public void makeSound() {
        System.out.println("Hoot");
    }
}
