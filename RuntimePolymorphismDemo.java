// Parent class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof Woof!");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow Meow!");
    }
}

// Child class 3
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow moos: Moo Moo!");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        // Using a parent reference to hold child objects
        Animal myAnimal;

        System.out.println("--- Runtime Polymorphism Demonstration ---");
        
        myAnimal = new Dog();
        // At runtime, the JVM determines that myAnimal refers to a Dog object
        // and calls the overridden makeSound method in the Dog class.
        myAnimal.makeSound(); 

        myAnimal = new Cat();
        // Now myAnimal refers to a Cat object
        myAnimal.makeSound();

        myAnimal = new Cow();
        // Now myAnimal refers to a Cow object
        myAnimal.makeSound();
    }
}
