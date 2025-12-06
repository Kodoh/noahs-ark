package NoahsArk.Concrete;

import NoahsArk.FlyingNonMammal;
import NoahsArk.NonMammal;

public class Fly extends FlyingNonMammal implements NonMammal {

    public Fly() {
        super("Fly");
    }
    @Override
    public void makeSound() {
        System.out.println("Buzz");
    }
}