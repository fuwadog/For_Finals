//inheritance

// base class
class Vehicle {
    protected String brand;

    public void honk() {
        System.out.println("Beep beep beep, ang sabi ng jeep");
    }
}

// derived class
class Bike extends Vehicle {
    private String modelName;

    public Bike(String brand, String modelName) {
        this.brand = brand;
        this.modelName = modelName;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + modelName);
    }

    public static void main(String[] args) {
        Bike bike = new Bike("Yamama", "MT-09");
        bike.honk();
        bike.displayDetails();
    }
}
