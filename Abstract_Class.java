// Abstract Class
abstract class Shape {

    // Abstract Method (no body)
    abstract void draw();

    // Normal Method (with body)
    void display() {
        System.out.println("This is a shape.");
    }
}

// Child Class
class Circle extends Shape {

    // Implementing abstract method
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Cannot create object of abstract class
        // Shape s = new Shape();  ❌ Not allowed

        // Reference of abstract class, object of child class
        Shape obj = new Circle();

        obj.display();  // Normal method
        obj.draw();     // Implemented abstract method
    }
}
