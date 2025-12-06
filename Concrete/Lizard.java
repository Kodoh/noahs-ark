package NoahsArk.Concrete;

import NoahsArk.AbstractAnimal;
import NoahsArk.NonMammal;

public class Lizard extends AbstractAnimal implements NonMammal {

    public Lizard() {
        super("Lizard");
    }
    @Override
    public void makeSound() {
        System.out.println("Lick");
    }
}
