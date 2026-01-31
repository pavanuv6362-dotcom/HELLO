    
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

public class code5 {
    public static void main(String[] args) {
        Animal myAnimal;
        
        myAnimal = new Dog();
        myAnimal.makeSound(); 
        
        myAnimal = new Cat();  
        myAnimal.makeSound();  
}
}



class Main {
    public static void  main(String[]args){
        
    }
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}