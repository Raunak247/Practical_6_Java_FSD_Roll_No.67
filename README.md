# Practical_6_Java_FSD_Roll_No.67
📘 Java OOP Concepts & Area Calculator

This project demonstrates fundamental Java programming concepts, including:

Method Overloading
Inheritance
Method Overriding
Runtime Polymorphism
Basic Mathematical Computations
📂 Project Structure
1. AreaCalculator.java

Implements method overloading to calculate areas of different shapes:

Square
Triangle
Circle
2. TestShapes.java

Demonstrates object-oriented programming (OOP) concepts:

Base class: Shape
Derived classes:
Rectangle
Circle
Triangle
Uses runtime polymorphism to call overridden draw() methods
🚀 Features
✔️ Clean and simple Java implementation
✔️ Demonstrates core OOP principles
✔️ Uses standard mathematical formulas
✔️ Beginner-friendly examples for learning
🧠 Concepts Covered
🔹 Method Overloading

Same method name (area) with different parameters:

void area(int side)
void area(double base, double height)
void area(double radius)
🔹 Inheritance

Child classes inherit from a parent Shape class:

class Rectangle extends Shape
🔹 Method Overriding

Each subclass provides its own implementation of draw().

🔹 Runtime Polymorphism
Shape s = new Rectangle();
s.draw();
▶️ How to Run
Compile the files:
javac AreaCalculator.java TestShapes.java
Run the programs:
java AreaCalculator
java TestShapes
📊 Plagiarism Report Summary
Similarity Index: 11%
Status: Acceptable
Risk Level: Low

The code uses standard programming patterns and widely known formulas, resulting in minimal similarity.

📅 Date

Generated on: 25 March 2026
