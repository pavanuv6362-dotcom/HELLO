abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();
    
    // Concrete method (with body)
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    // Must implement abstract method
    void makeSound() {
        System.out.println("Dog barks: Woof!");
    }
}

public class code7 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Woof!
        dog.sleep();      // Animal is sleeping
    }
}



