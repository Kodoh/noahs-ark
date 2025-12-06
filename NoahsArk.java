package NoahsArk;

import NoahsArk.Concrete.Bat;
import NoahsArk.Concrete.Bear;
import NoahsArk.Concrete.Beetle;
import NoahsArk.Concrete.Bird;
import NoahsArk.Concrete.Cat;
import NoahsArk.Concrete.Crocodile;
import NoahsArk.Concrete.Dog;
import NoahsArk.Concrete.Dolphin;
import NoahsArk.Concrete.Eagle;
import NoahsArk.Concrete.Fly;
import NoahsArk.Concrete.Frog;
import NoahsArk.Concrete.Lizard;
import NoahsArk.Concrete.Monkey;
import NoahsArk.Concrete.Owl;
import NoahsArk.Concrete.Pigeon;
import NoahsArk.Concrete.Salmon;
import NoahsArk.Concrete.Shark;
import NoahsArk.Concrete.Snake;
import NoahsArk.Concrete.Whale;

public class NoahsArk {

    public static void main(String[] args) {
        Animal[] animalsLoad = new Animal[]{
                new Bat(),
                new Bear(),
                new Beetle(),
                new Bird(),
                new Cat(),
                new Crocodile(),
                new Dog(),
                new Dolphin(),
                new Eagle(),
                new Fly(),
                new Frog(),
                new Lizard(),
                new Monkey(),
                new Owl(),
                new Pigeon(),
                new Salmon(),
                new Shark(),
                new Snake(),
                new Whale(),
                new Dog(),
        };

        for (Animal animal : animalsLoad) {
            System.out.println(animal);
            animal.makeSound();
            animal.reproduce();
            System.out.println();

        }
    }
}
