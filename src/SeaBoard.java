import java.util.Arrays;

//Module Praktika1 Zad_12
public class SeaBoard {
    private static final String[][] field = new String[10][10];
    public static final String m = "m";
    public static final String h = "h";
    public static final String d = "d";
    public static final String xTag = "x";
    public static final String xTagBig = "H";
    public static final String sharpTag = "#";

    public SeaBoard() {
        initField(field);
    }

    public void initField(String[][] field) {
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[1].length; y++) field[x][y] = ".";
        }
    }

    public String[][] getField() {
        String[][] copyField = new String[field.length][field[1].length];
        initField(copyField);
        for (int i = 0; i < copyField.length; i++) {
            for (int j = 0; j < copyField[0].length; j++) {
                if (!field[i][j].equals(xTagBig)) {
                    copyField[i][j] = field[i][j];
                } else {
                    copyField[i][j] = xTag;
                }
            }
        }
        return copyField;
    }

    public void shoot(int line, int column, String issue) {
        if (m.equals(issue)) {
            field[line][column] = sharpTag;
        } else if (h.equals(issue)) {
            field[line][column] = xTagBig;
        } else if (d.equals(issue)) {
            ifDestroyPlaceSharpAround(line, column, field);
        }
    }

    private static void ifDestroyPlaceSharpAround(int line, int column, String[][] field) {
        field[line][column] = xTag;
        ifNotXPlaceSharp(line, -1, column, 0, field);
        ifNotXPlaceSharp(line, -1, column, -1, field);
        ifNotXPlaceSharp(line, -1, column, 1, field);
        ifNotXPlaceSharp(line, 0, column, -1, field);
        ifNotXPlaceSharp(line, 0, column, 1, field);
        ifNotXPlaceSharp(line, 1, column, 0, field);
        ifNotXPlaceSharp(line, 1, column, -1, field);
        ifNotXPlaceSharp(line, 1, column, 1, field);
    }

    private static void ifNotXPlaceSharp(int line, int lineShift, int column, int columnShift, String[][] field) {
        int x = line + lineShift;
        int y = column + columnShift;
        if (x >= 0 && y >= 0 && x < field.length && y < field.length) {
            if (!field[x][y].equals(xTagBig) && !field[x][y].equals(xTag)) {
                field[x][y] = sharpTag;
            }
            if (field[x][y].equals(xTagBig)) {
                ifDestroyPlaceSharpAround(x, y, field);
            }
        }
    }

    public String check(int line, int column) {
        return xTagBig.equals(field[line][column]) ? xTag : field[line][column];
    }

    // here Main for TEST
    public class Main {
        public static void main(String[] args) {
            SeaBoard board = new SeaBoard();
            board.shoot(0, 0, "m");
            board.shoot(2, 0, "h");
            board.shoot(6, 9, "h");
            printArray(board);
            board.shoot(2, 1, "d");
            board.shoot(6, 4, "h");
            board.shoot(6, 5, "h");
            printArray(board);
            board.shoot(5, 9, "d");
            printArray(board);
        }

        private static void printArray(SeaBoard board) {
            for (int i = 0; i < board.getField().length; i++) {
                System.out.println(Arrays.toString(board.getField()[i]));
            }
            System.out.println("");
        }
    }
}