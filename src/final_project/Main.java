package final_project;

import java.util.ArrayList;

import final_project.SudokuField.errorCoordinate;

class Main{
    public static void main(String[] args) {

        // ゲーム開始
        SudokuField sudokuField = new SudokuField();

        for (Coordinate coordinate : sudokuField.getSudokuField()) {

            int xCoordinate = coordinate.getxCoordinate();
            int yCoordinate = coordinate.getyCoordinate();
            int value  = coordinate.getValue();
        }

        // 値が設定された時

        String id = "1_1";
        String value = "9";

        int xid = 1;
        int yid = 1;
        int value1 = 9;

        boolean test = sudokuField.setNumber(xid, yid, value1);

        if(!test) {
            System.out.println("shippai");
        }

        // 完成ボタン
        ArrayList<errorCoordinate> errorList = sudokuField.isCompetion();

        for (errorCoordinate error : errorList) {
            System.out.println(error);
        }

        
    }
}