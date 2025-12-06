package NoahsArk;

public abstract class AquaticNonMammal extends AbstractAnimal {
    public AquaticNonMammal(String name) {
        super(name);
    }

    @Override
    public void call() {
        System.out.println(this.name + " will not come...");
    }
}
