package week4.polymorphism;

/**
 * abstract class
 * 0. class + abstract
 * 1. you cannot create an instance of abstract classes.
 * 2. you can have abstract methods.
 *    - methods without implementation (body);
 */

public abstract class Shape {

    private double width;
    private double height;

    public Shape(){
    }

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract void draw();

    public void hello() {
        System.out.println("hello");
    }

    public void detil() {
        System.out.printf("width: %s, heigh: %s.", this.width, this.height);
    }
}