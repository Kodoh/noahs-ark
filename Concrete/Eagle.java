package NoahsArk.Concrete;

import NoahsArk.FlyingNonMammal;
import NoahsArk.NonMammal;

public class Eagle extends FlyingNonMammal implements NonMammal {

    public Eagle() {
        super("Eagle");
    }

    @Override
    public void makeSound() {
        System.out.println("Screech");
    }
}
