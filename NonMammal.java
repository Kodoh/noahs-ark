package NoahsArk;

public interface NonMammal extends Animal {


    @Override
     default void reproduce() {
        System.out.println("Laying eggs");
    }
}
