# Project Report: Implementation of Runtime Polymorphism

## 1. Project Objective
The objective of this project is to understand and implement **Runtime Polymorphism** (also known as Dynamic Method Dispatch) in Java. The goal is to create an application where a common parent reference can hold different child objects and execute their overridden behaviors dynamically at runtime.

## 2. Introduction
Polymorphism in Object-Oriented Programming allows objects to be treated as instances of their parent class rather than their actual class. **Runtime Polymorphism** is a process in which a call to an overridden method is resolved at runtime rather than at compile time. In Java, this is achieved through method overriding and parent class references.

## 3. Implementation Details
The project is implemented in Java and consists of a class hierarchy demonstrating the concept:
*   **Parent Class (`Animal`)**: Defines a generic method `makeSound()`.
*   **Child Classes (`Dog`, `Cat`, `Cow`)**: These classes inherit from `Animal` and override the `makeSound()` method to provide their specific implementations (e.g., barking, meowing, mooing).
*   **Main Class (`RuntimePolymorphismDemo`)**: This class contains the `main` method where a single `Animal` reference variable is used to instantiate and invoke methods on `Dog`, `Cat`, and `Cow` objects.

## 4. Source Code Overview
Below is the core implementation of the program:

```java
// Parent class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child classes overriding the parent method
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow Meow!");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow moos: Moo Moo!");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        // Parent reference pointing to different child objects
        Animal myAnimal;
        
        myAnimal = new Dog();
        myAnimal.makeSound(); // Outputs Dog's sound

        myAnimal = new Cat();
        myAnimal.makeSound(); // Outputs Cat's sound

        myAnimal = new Cow();
        myAnimal.makeSound(); // Outputs Cow's sound
    }
}
```

## 5. Execution Output
When the program is compiled and executed, the JVM dynamically determines which `makeSound()` method to call based on the object instance (not the reference type). The output generated is:

```text
--- Runtime Polymorphism Demonstration ---
The dog barks: Woof Woof!
The cat meows: Meow Meow!
The cow moos: Moo Moo!
```

## 6. Conclusion
The project successfully demonstrates the concept of runtime polymorphism. By utilizing a common parent reference, we can write flexible, reusable, and loosely coupled code. The Java Virtual Machine (JVM) accurately dispatches the method calls to the appropriate overridden child methods during runtime.
