class Animal{
  public void sound(){
        System.out.println("meow");
    }
}


class Dog extends Animal{
   public void bark(){
        System.out.println("bow bow");
    }
}

public class code1{
public static void main(String[] args){
Dog dg = new Dog();
dg.bark();
dg.sound();
}
}
      

  