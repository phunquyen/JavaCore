package Overriding;

public class MainApplication {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();
    }
}
