//classes and methods
public class Carrer {
    // properties
    private String make;
    private String model;
    private int year;

    // constructor
    public Carrer(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // the method to get the details
    public String getCarDetails() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }

    // the main method to test the class
    public static void main(String[] args) {
        Carrer car = new Carrer("Totoya", "Caroll", 2020);
        System.out.println(car.getCarDetails());
    }
}
