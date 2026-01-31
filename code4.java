    
    
    class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow!");
    }
}

public class code4 {
    public static void main(String[] args) {
        Animal myAnimal;
        
        myAnimal = new Dog();
        myAnimal.makeSound(); 
        
        myAnimal = new Cat();  
        myAnimal.makeSound();  
}
}
