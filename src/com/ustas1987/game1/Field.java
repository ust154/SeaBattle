package com.ustas1987.game1;

import java.util.Arrays;

public class Field {
    static final char CELL_FIELD = '\u2B1C'; // cell value on the field/ 2588/2327/274E/274F/2BBD/2B1C/2B1B
    static final byte SIZE = 10; // field size
    public static char[][] field = new char[SIZE][SIZE];

    public static void setField(char[][] field) {
        Field.field = field;
    }
    //method to create the playing field
    public static void creatTheField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = CELL_FIELD;
            }
        }
    }
    // method to display the field in console
    public static void showTheField() {
        System.out.println(" 1  2  3  4  5  6  7  8  9  10");
        for (char[] i : field) {
            for (char j : i) {
                //System.out.print(CELL_FIELD + " ");
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}


