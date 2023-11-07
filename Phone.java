package dz10;

public abstract class Phone<T> implements Callable<T>, Informable<T>{
    private T number;
    private String model;
    private double weight;

    public Phone(T number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void setNumber(T number) { //параметр метода типа T
        this.number = number;
    }

    public Phone() {

     }

    public T getNumber() { // возвращает объект типа T
        return number;
    }

    public  String getModel() {
        return model;
    }

    public  double getWeight() {
        return weight;
    }

    @Override
    public void setModel(String model) {

    }

    @Override
    public void setWeight(double weight) {

    }

    public Phone(double weight) {
        this.weight = weight;
    }

    public void info() {

    }
   public void receiveCall() throws NameException {

    }
}
