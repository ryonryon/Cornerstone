package week4.lab3;

import java.util.Objects;

public class Pawn extends ChessPiece{

    private boolean hasBeenPromoted;
    private ChessPiece newPiece;

    public Pawn(){
        super(1);
        this.hasBeenPromoted = false;
    }

    @Override
    public void move() {
        System.out.println("forward 1");
    }

    public void promote(ChessPiece newPiece) {
        if(hasBeenPromoted) {
            System.out.println("You have been promoted.");
            return;
        }
        if(newPiece.getValue() == 1000 || newPiece.getValue() == 1) {
            System.out.println("Invalid promotion.");
        }
        hasBeenPromoted = true;
        this.newPiece = newPiece;
        System.out.println("Poromoted to " + newPiece);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj == null || getClass() != obj.getClass()) return false;

        Pawn that = (Pawn) obj;
        return this.hasBeenPromoted == that.hasBeenPromoted;
        
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        if(!hasBeenPromoted) {
            return "Pawn is not promoted yet";
        } else {
            return "Pawn is promoted as " + newPiece.getValue();
        }
    }
}