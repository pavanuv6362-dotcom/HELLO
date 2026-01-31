
class Animal {
    Animal(String name) {
        System.out.println("Animal: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);  // Calls parent constructor
        System.out.println("Dog created");
    }
}

public class code6 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
    }
}