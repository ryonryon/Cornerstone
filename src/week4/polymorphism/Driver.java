package week4.polymorphism;

public class Driver {
    public static void main(String[] args) {
        
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();
        Shape[] shapes = { s1, s2, s3 };

        // down-casting
        ((Rectangle) s2).speak();

        for(Shape shape: shapes) {
            shape.draw();
        }
    }
}