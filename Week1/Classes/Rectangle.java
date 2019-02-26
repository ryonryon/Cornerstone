public class Rectangle extends Square{

    private int width;
    private int height;
    private String color;
    

    Rectangle(int width, int height){

        setWidth(width);
        setHeight(height);
    }
    Rectangle(int width, int height, String color){

        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    public setWidth(int width){
        this.width = 1;

        if(0 < width) {
            this.width = width;
        }
    }

    public setHeight(int height){
        this.height = 1;

        if(0 < height) {
            this.height = height;
        }
    }

    public setColor(String color) {
        this.color = "Blue";
        
        if(2 <= color.length && Character.isUpperCase(color.charAt[0])) {
            this.color = color;
        }
    }

    public draw() {
        String rectangleColor = this.color.charAt[0];

        for(int i = 0; i <= this.height; i++) {

            for(int j = 0; j <= this.width; j++) {
                
            }
        }
    }


}