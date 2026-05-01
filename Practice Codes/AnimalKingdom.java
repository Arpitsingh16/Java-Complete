public class AnimalKingdom {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.makeSound();
        dg.bark();
        
    }
    
}

class Animal{
    void makeSound(){
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal{

    @Override
    void makeSound(){
    super.makeSound();
    System.out.println("Dog makes barking sound");
    }

    void bark(){
        System.out.println("Dog Barks");
    }
}

