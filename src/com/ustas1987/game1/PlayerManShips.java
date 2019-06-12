package com.ustas1987.game1;

public class PlayerManShips {
    static int countOfShips = 0;
    static int NUMBER_OF_SHIPS = 10;
    static PlayerManShips[] manShips = new PlayerManShips[NUMBER_OF_SHIPS];
    int numberOfDecks;

    // method to create the Player Ships
    static void createPlayerShips() {
        for (int i = 0; i < manShips.length; i++) {
            manShips[i] = new PlayerManShips();//create new Player Ships
            countOfShips++;
        }
        manShips[0].numberOfDecks = 1;//player ship "1" has 1 deck
        manShips[1].numberOfDecks = 1;//player ship "2" has 1 deck
        manShips[2].numberOfDecks = 1;//player ship "3" has 1 deck
        manShips[3].numberOfDecks = 1;//player ship "4" has 1 deck
        manShips[4].numberOfDecks = 2;//player ship "5" has 2 deck
        manShips[5].numberOfDecks = 2;//player ship "6" has 2 deck
        manShips[6].numberOfDecks = 2;//player ship "7" has 2 deck
        manShips[7].numberOfDecks = 3;//player ship "8" has 3 deck
        manShips[8].numberOfDecks = 3;//player ship "9" has 3 deck
        manShips[9].numberOfDecks = 4;//player ship "10"has 4 deck

        System.out.println("Количество кораблей у игрока :" + countOfShips);
        System.out.println("У корабля " + manShips[4] + " :" + manShips[4].numberOfDecks + " палубы");
    }
}
