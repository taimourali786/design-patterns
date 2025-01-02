package Strategy;

public abstract class Duck {
    
    FlyBehaviour flyBehaviour;
    public Duck(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }
    public void quack(){
        
    }
    public void swim(){
        
    }
    public abstract void display();
    
    public void fly(){
        flyBehaviour.fly();
    }
}
