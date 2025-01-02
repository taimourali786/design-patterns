package Factory;

public abstract class PizzaStore {

    public static void orderPizza(String type) {
        Pizza pizza = PizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.pack();
    }

    public abstract Pizza createPizza(String type);
}
