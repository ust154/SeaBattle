package com.ustas1987.game1;

public class Main {
    public static void main(String[] args) {
        Field.creatTheField();
        Field.showTheField();

        UserShips.createUserShips();
        UserShips.setTheShipsOnTheField();
    }
}
