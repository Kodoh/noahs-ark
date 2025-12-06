package NoahsArk.Concrete;

import NoahsArk.FlyingNonMammal;
import NoahsArk.NonMammal;

public class Pigeon extends FlyingNonMammal implements NonMammal {


    public Pigeon() {
        super("Pigeon");
    }
    @Override
    public void makeSound() {
        System.out.println("Coo");
    }
}
