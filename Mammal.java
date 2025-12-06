package NoahsArk;

import org.w3c.dom.ls.LSOutput;

public interface Mammal extends Animal {


    @Override
     default void reproduce() {
        System.out.println("Giving birth");
    };
}
