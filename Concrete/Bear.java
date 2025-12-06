package NoahsArk.Concrete;

import NoahsArk.AbstractAnimal;
import NoahsArk.Mammal;

public class Bear extends AbstractAnimal implements Mammal {
    public Bear() {
        super("Bear");
    }
    @Override
    public void makeSound() {
        System.out.println("Growl");
    }
}
