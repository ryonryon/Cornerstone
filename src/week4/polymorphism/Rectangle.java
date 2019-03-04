package week4.polymorphism;

public class Rectangle extends Shape {

    public void speak() {
        System.out.println("Rectangle is speaking...");
    }
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn.");
    }

}