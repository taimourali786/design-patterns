package Factory;

public class CheesePizza implements Pizza {
    public void prepare() {
        System.out.println("CHEESE: Preparing");
    }

    public void bake() {
        System.out.println("CHEESE: Baking");
    }

    public void cut() {
        System.out.println("CHEESE: Cutting");
    }

    public void pack() {
        System.out.println("CHEESE: Packing");
    }
}