package com.ustas1987.game1;

public class Field {
    static final String CELL_FIELD = "[ ]"; // cell value on the field
    static final byte SIZE = 10; // field size
    static String[][] field = new String[SIZE][SIZE];

    // method to display the field in console
    public static void showTheField() {
        for (String[] i : field) {
            for (String j : i) {
                System.out.print(CELL_FIELD + " ");
            }
            System.out.println(" ");
        }
    }
}


