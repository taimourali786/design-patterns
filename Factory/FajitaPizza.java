package Factory;

public class FajitaPizza implements Pizza {
    public void prepare() {
        System.out.println("FAJITA: Preparing");
    }

    public void bake() {
        System.out.println("FAJITA: Baking");
    }

    public void cut() {
        System.out.println("FAJITA: Cutting");
    }

    public void pack() {
        System.out.println("FAJITA: Packing");
    }
}
