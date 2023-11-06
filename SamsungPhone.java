package dz10;

class SamsungPhone<T> extends Phone<T>{
    private T number;
    private String model;
    private double weight;
    private String abonent;

    SamsungPhone(T number, String model, double weight, String abonent) {
        super();
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.abonent = abonent;
    }

    @Override
        public void info() {
           System.out.printf("Number: %s \tModel: %s Weight: %.2f\n", number, model, weight);

    }

    @Override
    public void receiveCall() {
        System.out.println( "Abonent: \t" + number + " \t" + abonent);
    }
}
