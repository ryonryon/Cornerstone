package week3.inclass;

public class Circle {

    private double radius;
    
    Circle(double radius) {
        setRadius(radius);
    }
    
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if(0 < radius) {
            this.radius = radius;
        }
    }

    public double area() {
        double circleArea = Math.PI * this.radius * this.radius;

        return circleArea;
    }

    public double circumference() {
        double circleCircumference = 2 * Math.PI * this.radius;

        return circleCircumference;
    }
}