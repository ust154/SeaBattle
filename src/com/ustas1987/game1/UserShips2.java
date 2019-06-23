package com.ustas1987.game1;

public class UserShips2 {
    int numberOfDecks;
    static int NUMBER_OF_SHIPS = 10;
    static UserShips2[] userShips = new UserShips2[NUMBER_OF_SHIPS];//the mass of the user ships

    public UserShips2(int numberOfDekcs) {
        this.numberOfDecks = numberOfDekcs;
    }

    static void createUserShips() {
        userShips[0] = new UserShips2(1);
        userShips[1] = new UserShips2(1);
        userShips[2] = new UserShips2(1);
        userShips[3] = new UserShips2(1);
        userShips[4] = new UserShips2(2);
        userShips[5] = new UserShips2(2);
        userShips[6] = new UserShips2(2);
        userShips[7] = new UserShips2(3);
        userShips[8] = new UserShips2(3);
        userShips[9] = new UserShips2(4);

//        userShips[0] = new UserShips(1, shipPositionX, shipPositionY, isTheShipHorizontal);
//        userShips[1] = new UserShips(1, shipPositionX, shipPositionY, isTheShipHorizontal);
//        userShips[2] = new UserShips(1, shipPositionX, shipPositionY, isTheShipHorizontal);
//        userShips[3] = new UserShips(1, shipPositionX, shipPositionY, isTheShipHorizontal);
//        userShips[4] = new UserShips(2, shipPositionX, shipPositionY, isTheShipHorizontal);
//        userShips[5] = new UserShips(2, shipPositionX, shipPositionY, isTheShipHorizontal);
//        userShips[6] = new UserShips(2, shipPositionX, shipPositionY, isTheShipHorizontal);
//        userShips[7] = new UserShips(3, shipPositionX, shipPositionY, isTheShipHorizontal);
//        userShips[8] = new UserShips(3, shipPositionX, shipPositionY, isTheShipHorizontal);
//        userShips[9] = new UserShips(4, shipPositionX, shipPositionY, isTheShipHorizontal);
        System.out.println(userShips);
    }

}


