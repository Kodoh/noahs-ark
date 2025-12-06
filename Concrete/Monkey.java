package NoahsArk.Concrete;

import NoahsArk.AbstractAnimal;
import NoahsArk.Mammal;

public class Monkey  extends AbstractAnimal implements Mammal {

    public Monkey() {
        super("Monkey");
    }
    @Override
    public void makeSound() {
        System.out.println("Scream");
    }
}