package Factory;

public class PizzaFactory {

    // Pizza factory is only class responsible for generating pizz object
    // So in our whole application this is the only place responsible for creating
    // pizza
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type == "cheese") {
            pizza = new CheesePizza();
        } else if (type == "bbq") {
            pizza = new BbqPizza();
        } else if (type == "fajita") {
            pizza = new FajitaPizza();
        } else {
            throw new RuntimeException("Unknown Type");
        }
        return pizza;
    }
}
