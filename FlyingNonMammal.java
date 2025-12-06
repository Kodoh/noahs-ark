package NoahsArk;

public abstract class FlyingNonMammal extends AbstractAnimal {
    public FlyingNonMammal(String name) {
        super(name);
    }

    @Override
    public void call() {
        System.out.println(this.name + " now flying, will come later when tired...");
    }
}
