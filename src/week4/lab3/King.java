package week4.lab3;

public class King extends ChessPiece {

    public King(){
        super(1000);
    }

    @Override
    public void move() {
        System.out.println("one square");
    }
}