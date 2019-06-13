package com.ustas1987.game1;

public class UserShips {
    static int countOfShips = 0;
    static int NUMBER_OF_SHIPS = 10;
    static UserShips[] userShips = new UserShips[NUMBER_OF_SHIPS];
    int numberOfDecks;
    static int shipPositionX;
    static int shipPositionY;


    // method to create the Player Ships
    static void createUserShips() {
        for (int i = 0; i < userShips.length; i++) {
            userShips[i] = new UserShips();//create new Player Ships
            countOfShips++;
        }
        userShips[0].numberOfDecks = 1;//player ship "1" has 1 deck
        userShips[1].numberOfDecks = 1;//player ship "2" has 1 deck
        userShips[2].numberOfDecks = 1;//player ship "3" has 1 deck
        userShips[3].numberOfDecks = 1;//player ship "4" has 1 deck
        userShips[4].numberOfDecks = 2;//player ship "5" has 2 deck
        userShips[5].numberOfDecks = 2;//player ship "6" has 2 deck
        userShips[6].numberOfDecks = 2;//player ship "7" has 2 deck
        userShips[7].numberOfDecks = 3;//player ship "8" has 3 deck
        userShips[8].numberOfDecks = 3;//player ship "9" has 3 deck
        userShips[9].numberOfDecks = 4;//player ship "10"has 4 deck

        System.out.println("Количество кораблей у игрока :" + countOfShips);
        System.out.println("У корабля " + userShips[4] + " :" + userShips[4].numberOfDecks + " палубы");
    }

    public static void setTheShipsOnTheField(){
    shipPositionX = (int) (Math.random() * 10);
    shipPositionY = (int) (Math.random() * 10);




    }


}
