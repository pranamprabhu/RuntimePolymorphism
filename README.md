# Runtime Polymorphism in Java

This repository contains a simple Java application demonstrating **Runtime Polymorphism** (Dynamic Method Dispatch).

## Description
The application demonstrates how a common parent reference can hold different child objects and execute overridden behaviors dynamically at runtime.

### Deliverables Included:
- **Parent class**: `Animal`
- **Multiple child classes**: `Dog`, `Cat`, `Cow`
- **Overridden methods**: `makeSound()`
- **Polymorphism demonstration**: The `RuntimePolymorphismDemo` class assigns different child objects to the parent reference and calls the overridden method.

## How to Run
1. Compile the code:
   ```bash
   javac RuntimePolymorphismDemo.java
   ```
2. Run the compiled application:
   ```bash
   java RuntimePolymorphismDemo
   ```

## Output
```text
--- Runtime Polymorphism Demonstration ---
The dog barks: Woof Woof!
The cat meows: Meow Meow!
The cow moos: Moo Moo!
```
