package week4.lab3;

import java.util.Objects;

public abstract class ChessPiece {

    private int value;

    public ChessPiece(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public abstract void move();

    @Override
    public String toString() {
        return "ChessPiece(value=" + value + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj == null || getClass() != obj.getClass()) return false;

        ChessPiece chesspiece = (ChessPiece) obj;
        return value == chesspiece.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}