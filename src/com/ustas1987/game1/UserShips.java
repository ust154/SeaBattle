package com.ustas1987.game1;

import java.util.Random;

public class UserShips {
    static int NUMBER_OF_SHIPS = 10;
    int numberOfDecks;
    static int countOfShips = 10;
    static int shipPositionX;
    static int shipPositionY;
    static boolean isTheShipHorizontal;
    static char SHIP_ON_THE_FIELD = '\u2B1B';
    static UserShips[] userShips = new UserShips[NUMBER_OF_SHIPS];//the mass of the user ships

    public UserShips(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    // method to create the users Ships
    static void createUserShips() {
        userShips[0] = new UserShips(1);
        userShips[1] = new UserShips(1);
        userShips[2] = new UserShips(1);
        userShips[3] = new UserShips(1);
        userShips[4] = new UserShips(2);
        userShips[5] = new UserShips(2);
        userShips[6] = new UserShips(2);
        userShips[7] = new UserShips(3);
        userShips[8] = new UserShips(3);
        userShips[9] = new UserShips(4);
        for (int i = 0; i < NUMBER_OF_SHIPS; i++) {
            System.out.print(userShips[i].numberOfDecks + " ");
        }
    }

    public static boolean typeOfTheShips() {
        final Random random = new Random();
        isTheShipHorizontal = (random.nextInt(2) == 0) ? true : false;
        return isTheShipHorizontal;
    }

    //method to set the ships on the field
    public static void autoSetUserShipsOnTheField() {
        typeOfTheShips();

        if (isTheShipHorizontal = true) {
            for (int i = 0; i < NUMBER_OF_SHIPS; i++) {
                shipPositionX = (int) (Math.random() * 10);
                shipPositionY = (int) (Math.random() * 10);
                Field.field[shipPositionX][shipPositionY] = SHIP_ON_THE_FIELD;
                countOfShips--;
            }
        } else {
            for (int i = 0; i < NUMBER_OF_SHIPS; i++) {
                shipPositionX = (int) (Math.random() * 10);
                shipPositionY = (int) (Math.random() * 10);
                Field.field[shipPositionX][shipPositionY] = SHIP_ON_THE_FIELD;
                countOfShips--;
            }
        }
        Field.showTheField();
    }
}




