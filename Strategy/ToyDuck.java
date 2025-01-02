package Strategy;

public class ToyDuck extends Duck {

    public ToyDuck(){
        super(new NoFly());
    }
    
    public void display(){
        System.out.println("ToyDuck");
    }

    // Here we don't need fly but because of our implementation we have to put it here
    // @Override
    // public void fly(){
        
    // }
}
