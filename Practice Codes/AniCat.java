public class AniCat {
    public static void main(String[] args) {
        Animal ani = new Cat(); 
        ani.makeSound();        
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animals Make Sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Cat Makes Sound");
    }
}
