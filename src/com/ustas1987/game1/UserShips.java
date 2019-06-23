package com.ustas1987.game1;

import java.util.Arrays;
import java.util.Random;
import java.util.function.ToDoubleBiFunction;

public class UserShips {
    static int NUMBER_OF_SHIPS = 10;
    static int numberOfDecks;
    static int countOfShips;
    static int shipPositionX;
    static int shipPositionY;
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
            /* TODO
            * в методе createUserShips попробовать в каждои ифе присваивать созданному кораблю ячейку на поле.
            * либо рисовать его на поеле после: за рамками ифоф
            * */


        }
        Field.showTheField();
//        for (int i = 0; i < NUMBER_OF_SHIPS; i++) {
//            System.out.print(userShips[i].numberOfDecks + " ");
//        }
//        System.out.println(" ");
//        //method to set the ships on the field
//        public static void autoSetUserShipsOnTheField () {
//
//
//        }
//
//        System.out.println(isTheShipHorizontal);
//        System.out.println(countOfShips);
    }
//        shipPositionX = random.nextInt(Field.SIZE - (isTheShipHorizontal ? numberOfDecks : 0));
//        shipPositionY = random.nextInt(Field.SIZE - (isTheShipHorizontal ? 0 : numberOfDecks));
//        shipPositionX = random.nextInt(Field.SIZE - numberOfDecks + 1);
//        shipPositionY = random.nextInt(Field.SIZE - numberOfDecks + 1);
}











