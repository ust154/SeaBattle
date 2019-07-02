package com.ustas1987.game1;

import java.util.Random;

public class UserShips {
    static UserShips userShip;
    static int NUMBER_OF_SHIPS = 10;
    static int numberOfDecks;
    static int countOfShips;
    int shipPositionX;
    int shipPositionY;
    static boolean isTheShipHorizontal; //ориентация: true - горизонтальная, false - вертикальная
    static char SHIP_ON_THE_FIELD = '\u2B1B';
    static UserShips[] userShips = new UserShips[NUMBER_OF_SHIPS];//the mass of the user ships

    public UserShips(int numberOfDecks, int shipPositionX, int shipPositionY, boolean isTheShipHorizontal) {
        this.numberOfDecks = numberOfDecks;
        this.shipPositionX = shipPositionX;
        this.shipPositionY = shipPositionY;
        this.isTheShipHorizontal = isTheShipHorizontal;
    }


    // method to create the users Ships
    static void createUserShips() {
        final Random random = new Random();
        for (int i = 0; i < userShips.length; i++) {
            isTheShipHorizontal = random.nextBoolean();// определяет направление корабля
            countOfShips++;//увеличивает количество кораблей после каждой итерации
            if (countOfShips == 1) {
                userShips[i] = new UserShips(4, random.nextInt(10), random.nextInt(10), isTheShipHorizontal);
            } else if (countOfShips > 1 && countOfShips <= 3) {
                userShips[i] = new UserShips(3, random.nextInt(10), random.nextInt(10), isTheShipHorizontal);
            } else if (countOfShips > 3 && countOfShips <= 6) {
                userShips[i] = new UserShips(2, random.nextInt(10), random.nextInt(10), isTheShipHorizontal);
            } else if (countOfShips > 6 && countOfShips <= 10) {
                userShips[i] = new UserShips(1, random.nextInt(10), random.nextInt(10), isTheShipHorizontal);
            }
        }

    }

    public void setUserShips(UserShips userShip) {
        this.userShip = userShip;
        if (userShip.isTheShipHorizontal) {
            for (int i = 0; i < userShips.length; i++) {
                Field.field[userShip.shipPositionX + i][userShip.shipPositionY] = 'X';
            }
        } else {
            for (int i = 0; i < userShips.length; i++) {
                Field.field[userShip.shipPositionX][userShip.shipPositionY + i] = 'X';
            }
        }
        Field.showTheField();
    }
}
















