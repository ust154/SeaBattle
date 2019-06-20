package com.ustas1987.game1;

public class Main {
    public static void main(String[] args) {
        //UserShips userShips = new UserShips();

        Field.creatTheField();
        Field.showTheField();

        //UserShips.createUserShips();
        //UserShips.setTheShipsOnTheField();
       // UserShips.autoSetUserShipsOnTheField(1,10);
        //UserShips.autoSetUserShipsOnTheField();
    UserShips.createUserShips();
    UserShips.autoSetUserShipsOnTheField();

    }

}
