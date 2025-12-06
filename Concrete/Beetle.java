package NoahsArk.Concrete;

import NoahsArk.FlyingNonMammal;
import NoahsArk.NonMammal;

public class Beetle extends FlyingNonMammal implements NonMammal {

    public Beetle() {
        super("Beetle");
    }
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
}
