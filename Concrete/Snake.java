package NoahsArk.Concrete;

import NoahsArk.AbstractAnimal;
import NoahsArk.NonMammal;

public class Snake extends AbstractAnimal implements NonMammal {

    public Snake() {
        super("Snake");
    }
    @Override
    public void makeSound() {
        System.out.println("Hiss");
    }
}
