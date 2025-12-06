package NoahsArk.Concrete;

import NoahsArk.AbstractAnimal;
import NoahsArk.Mammal;

public class Dog  extends AbstractAnimal implements Mammal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}