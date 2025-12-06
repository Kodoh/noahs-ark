package NoahsArk;

import NoahsArk.Concrete.*;

public class NoahsArkMain {
    public static void main(String[] args) {
        System.out.println("========== Noah's Ark - Animal Showcase ==========\n");

        // Mammals
        System.out.println("--- Mammals ---");
        testAnimal(new Dog());
        testAnimal(new Cat());
        testAnimal(new Bear());
        testAnimal(new Monkey());
        testAnimal(new Bat());
        testAnimal(new Whale());
        testAnimal(new Dolphin());

        System.out.println("\n--- Flying Non-Mammals ---");
        testAnimal(new Eagle());
        testAnimal(new Owl());
        testAnimal(new Pigeon());
        testAnimal(new Fly());
        testAnimal(new Beetle());

        System.out.println("\n--- Non-Flying Non-Mammals ---");
        testAnimal(new Lizard());
        testAnimal(new Snake());
        testAnimal(new Frog());
        testAnimal(new Crocodile());
        testAnimal(new Salmon());
        testAnimal(new Shark());

        System.out.println("\n========== Test Complete ==========");
    }

    private static void testAnimal(Animal animal) {
        System.out.println("\n" + animal + ":");
        System.out.print("  Sound: ");
        animal.makeSound();
        System.out.print("  Reproduction: ");
        animal.reproduce();
        System.out.print("  Calling: ");
        animal.call();
    }
}
