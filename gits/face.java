// interface
interface Animal {
    void eat();

    void sleep();
}

// implements the interface
class Lion implements Animal {
    public void eat() {
        System.out.println("Lion eats pussy");
    }

    public void sleep() {
        System.out.println("Lion shlep");
    }
}

public class face {
    public static void main(String[] args) {
        Animal myLion = new Lion();
        myLion.eat();
        myLion.sleep();
    }
}
