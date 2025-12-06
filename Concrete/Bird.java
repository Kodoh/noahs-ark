package NoahsArk.Concrete;

import NoahsArk.FlyingNonMammal;
import NoahsArk.NonMammal;

public class Bird extends FlyingNonMammal implements NonMammal {

    public Bird() {
        super("Bird");
    }
    @Override
    public void makeSound() {
        System.out.println("Tweet");
    }
}
