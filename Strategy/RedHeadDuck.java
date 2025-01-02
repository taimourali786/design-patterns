package Strategy;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        super(new FlyWithWings());
    }
    public void display(){
        System.out.println("RedHeadDuck");
    }
    // @Override
    // public void fly(){
        
    // }
}
