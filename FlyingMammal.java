package NoahsArk;

public abstract class FlyingMammal extends AbstractAnimal {
    public FlyingMammal(String name) {
        super(name);
    }

    @Override
    public void call() {
        System.out.println(this.name + " now flying, will come later when tired...");
    }
}
