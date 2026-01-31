

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

 
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class code3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.eat();  
        dog.bark(); 
        System.out.println();
        
        cat.eat();   
        cat.meow();
    }
}
