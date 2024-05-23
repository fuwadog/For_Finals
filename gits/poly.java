//polymorphism

// base class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound like uhh");
    }
}

// Derived class
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks because kasi");
    }
}

// derived class
class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows kasi because");
    }
}

public class poly {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // the output dog barks
        myCat.sound(); // the output cat meows
    }
}
