package week1.Classes;

public class Rectangle {

    private int width;
    private int height;
    private String color;
    

    public Rectangle(int width, int height){

        setWidth(width);
        setHeight(height);
    }
    public Rectangle(int width, int height, String color){

        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    public void setWidth(int width){
        this.width = 1;

        if(0 < width) {
            this.width = width;
        }
    }

    public void setHeight(int height){
        this.height = 1;

        if(0 < height) {
            this.height = height;
        }
    }

    public void setColor(String color) {
        this.color = "Blue";
        
        if(2 <= color.length() && Character.isUpperCase(color.charAt(0))) {
            this.color = color;
        }
    }

    public void draw() {

        System.out.println(this.width);
        System.out.println(this.height);
        System.out.println(this.color);
    }


}