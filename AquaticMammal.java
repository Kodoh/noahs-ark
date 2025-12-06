package NoahsArk;

public abstract class AquaticMammal extends AbstractAnimal{


    public AquaticMammal(String name) {
        super(name);
    }

    @Override
    public void call() {
        System.out.println(this.name + " will not come...");
    }
}
