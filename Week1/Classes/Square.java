public class Square {
    private String color;
    private int side;

    // Constructor - creates an instance of a Square
    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    // Constructor - creates a Square with default color
    public Square(int side) {
        this.color = "Black";
        this.side = side;
    }

    // Setter and Getter
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method
    public void paint() {
        String paintColor = this.color.substring(0, 1);
        for (int row = 0; row < this.side; row++) {
            for (int col = 0; col < this.side; col++) {
                System.out.print(paintColor + " "); // <- not println: print new line
            }
            System.out.println();
        }
    }
}