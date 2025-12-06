package NoahsArk.Concrete;

import NoahsArk.AbstractAnimal;
import NoahsArk.Mammal;

public class Cat  extends AbstractAnimal implements Mammal {

    public Cat() {
        super("Cat");
    }
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}