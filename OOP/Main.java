class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.makeSound(); // "Meow"
        animal2.makeSound(); // "Woof"
    }
}
