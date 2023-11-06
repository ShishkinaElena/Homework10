package dz10;

public interface Callable<T> {
    T getNumber();
    String getModel();
    double getWeight();

    void setModel(String model);
    void setWeight(double weight);
    void info();

    void receiveCall();

}
