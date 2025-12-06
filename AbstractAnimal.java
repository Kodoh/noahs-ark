package NoahsArk;

public abstract class AbstractAnimal implements Animal{

    protected  String name;

    public AbstractAnimal (String name) {
        this.name = name;
    }
    public void call() {
        System.out.println(this.name + " coming...");
    }


    @Override
    public String toString() {
        return this.name;
    }
}
