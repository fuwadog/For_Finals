//objects and methods
public class objects_and_methods {

    public static void main(String[] args) {
        // creates an bject of the car class
        Carrer myCar = new Carrer("Honda", "Civic", 2018);

        // the call method to get car details
        String details = myCar.getCarDetails();
        System.out.println(details);
    }

}
