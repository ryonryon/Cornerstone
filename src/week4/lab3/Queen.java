package week4.lab3;

public class Queen extends ChessPiece{

    public Queen(){
        super(9);
    }

    @Override
    public void move() {
        System.out.println("like a bishop or a rook");
    }
}