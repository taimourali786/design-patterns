// In builder design pattern: We create a builder to create an object step by step instead of creating multiple constructors in one class
class CarBuilder {
private  int id;
    private String name;
    private String make;
    private String model;
    private String year;

    public void id(int id){
        this.id = id;
    };
    public void name(String name){
        this.name = name;
    };
    public void make(String make){
        this.make = make;
    };
    public void model(String model){
        this.model = model;
    };
    public void year(String year){
        this.year = year;
    };

    public Car build(){
        return new Car(id, name, make, model, year);
    }
}