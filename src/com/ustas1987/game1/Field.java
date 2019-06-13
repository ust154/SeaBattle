package com.ustas1987.game1;

public class Field {
    static final String CELL_FIELD = "[ ]"; // cell value on the field
    static final byte SIZE = 10; // field size
    public static String[][] field = new String[SIZE][SIZE];

    public static void setField(String[][] field) {
        Field.field = field;
    }
    // method to display the field in console

    public static void showTheField() {
        System.out.println(" 1   2   3   4   5   6   7   8   9   10");
        for (String[] i : field) {
            for (String j : i) {
                System.out.print(CELL_FIELD + " ");
            }

            System.out.println(" ");
        }

    }
}


