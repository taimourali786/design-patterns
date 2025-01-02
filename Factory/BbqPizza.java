package Factory;

public class BbqPizza implements Pizza {
    public void prepare() {
        System.out.println("BBQ: Preparing");
    }

    public void bake() {
        System.out.println("BBQ: Baking");
    }

    public void cut() {
        System.out.println("BBQ: Cutting");
    }

    public void pack() {
        System.out.println("BBQ: Packing");
    }
}
