import java.util.Arrays;

//static int testNumber = 1;
//System.out.println("Test #" + testNumber++ + "   " + Arrays.toString(nuts));


//Module Praktika1 Zad_1
class Balance {
    private int right = 0;
    private int left = 0;

    public void addRight(int n) {
        right += n;
    }

    public void addLeft(int n) {
        left += n;
    }

    public char getSituation() {
        if (right > left) {
            return 'R';
        } else if (right < left) {
            return 'L';
        } else {
            return '=';
        }
    }
}

//Module Praktika1 Zad_2
class Bell {
    static int soundCounter = 1;

    public void sound() {
        if (soundCounter % 2 == 1) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        soundCounter++;
    }
}

//Module Praktika1 Zad_3
class Payer {
    private String sername = "фамилия";
    private String name = "имя";
    private String address = "Адрес";
    private String cardNumber = "Номер карты";

    public Payer(String sername, String name, String address, String cardNumber) {
        this.sername = sername;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public String toString() {
        return "Player:" + sername + " " + name + ", address: " + address + ", card: " + cardNumber;
    }

}

//Module Praktika1 Zad_4
class Dog {
    private String name = "name";
    private int age = 0;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String bark() {
        return "woof";
    }
}

//Module Praktika1 Zad_5
class Human {
    String name = "HumanName";
    int age = 1;
    int weight = 2;
    String address = null;
    String work = null;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.address = null;
        this.work = null;
    }

    public Human(String name, String address) {
        this.name = name;
        this.age = 3;
        this.weight = 10;
        this.address = address;
        this.work = null;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.work = null;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.address = null;
        this.work = work;
    }

    public Human(int age, int weight, String address, String work) {
        this.name = "HumanName";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }
}

//          -= Medium difficulty tasks  =-
//Module Praktika1 Zad_6
class Programmer {
    String name = "ProgrammerName";
    String company = "CompanyName";
    String position = "intern";
    int positionLvl = 1;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    public String getPosition() {
        return position;
    }

    public void work() {
        ++positionLvl;
        if (positionLvl == 6) positionLvl = 5;
        if (positionLvl == 1) {
            position = "intern";
        } else if (positionLvl == 2) {
            position = "junior";
        } else if (positionLvl == 3) {
            position = "middle";
        } else if (positionLvl == 4) {
            position = "senior";
        } else {
            position = "lead";
        }
    }
}

//Module Praktika1 Zad_7
class LimitingRectangle {
    int[][] point = new int[2][];

    public LimitingRectangle(int[][] point) {
        this.point = point;
    }

    public int getWidth() {
        int max = getMax(0);
        int min = getMin(0);
        return Math.abs(max - min);
    }

    public int getHeight() {
        int max = getMax(1);
        int min = getMin(1);
        return Math.abs(max - min);
    }

    public String getBorders() {
        int xMax = getMax(0);
        int xMin = getMin(0);
        int yMax = getMax(1);
        int yMin = getMin(1);
        return yMin + ", " + yMax + ", " + xMin + ", " + xMax;
    }

    private int getMax(int xOrY) {
        int max = -2147483648;
        for (int[] ints : point) {
            if (max < ints[xOrY]) {
                max = ints[xOrY];
            }
        }
        return max;
    }

    private int getMin(int xOrY) {
        int min = 2147483647;
        for (int[] ints : point) {
            if (min > ints[xOrY]) {
                min = ints[xOrY];
            }
        }
        return min;
    }
}

//Module Praktika1 Zad_8
class Separator {
    int[] array;

    public Separator(int[] x) {
        array = x;
    }

    public int[] even() {
        int[] evenArr = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int arrayElement = array[i];
            if ((arrayElement % 2) == 0) {
                evenArr[count] = arrayElement;
                count++;
            }
        }
        return Arrays.copyOfRange(evenArr, 0, count);
    }

    public int[] odd() {
        int[] oddArr = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int arrayElement = array[i];
            if ((arrayElement % 2) != 0) {
                oddArr[count] = arrayElement;
                count++;
            }
        }
        return Arrays.copyOfRange(oddArr, 0, count);
    }

}
/*
public class Main {
    public static void main(String[] args) {
        Separator separator = new Separator(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 66, 55, 44, 88, 2, 7, 7, 7, 7, 9, 8, 5, 5, 5, 7, 9, 1, 3, 33, 57});
        System.out.println(Arrays.toString(separator.even()) + "\n" + Arrays.toString(separator.odd()));
    }
}*/ // проверка Separator

//Module Praktika1 Zad_9      - ToTable  and  ToLine
class ToTable {
    int[] data;
    int x, y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int[][] arrResize = new int[x][y];
        int count = 0;
        for (int[] ints : arrResize) {
            Arrays.fill(ints, 0);
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arrResize[i][j] = data[count];
                count++;
            }
        }
        return arrResize;
    }

}

//Module Praktika1 Zad_9      - ToTable  and  ToLine
class ToLine {
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
        int[] arrResize = new int[data.length * data[1].length];
        int count = 0;
        for (int[] datum : data) {
            for (int j = 0; j < data[1].length; j++) {
                arrResize[count] = datum[j];
                count++;
            }
        }
        return arrResize;
    }
}
/*class Main {
    public static void main(String[] args) {
        ToTable a = new ToTable(new int[]{1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arrTable = a.resize();
        for (int[] ints : arrTable) {
            System.out.print(Arrays.toString(ints));
        }
        ToLine b = new ToLine(new int[][]{{1, 2}, {3, 4}, {5, 6}});
        int[] arrLine = b.resize();
        System.out.print("\n" + Arrays.toString(arrLine));
    }
}*/  // проверка Separator

//Module Praktika1 Zad_10
class Mage {
    private final String name;
    private int level;
    private int damage;
    private final String type;
    private final static String type1 = "fire";
    private final static String type2 = "ice";
    private final static String type3 = "earth";

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        switch (type) {
            case ("fire"):
            case ("ice"):
            case ("earth"):
                this.type = type;
                break;
            default:
                this.type = "fire";
        }
    }

    public String getInfo() {
        return name + ", " + level + ", " + damage + ", " + type;
    }

    public String fight(Mage enemyMage) {
        int mageWin = 0;
        if (!sameTypeOfMagic(this.type, enemyMage.type)) mageWin = battleTypeOfMage(this.type, enemyMage.type);
        else if (this.level > enemyMage.level) mageWin = 1;
        else if (this.level < enemyMage.level) mageWin = 2;
        else if (this.damage > enemyMage.damage) mageWin = 1;
        else if (this.damage < enemyMage.damage) mageWin = 2;

        switch (mageWin) {
            case 0:
                return "draw";
            case 1:
                return this.name;
            case 2:
                return enemyMage.name;
            default:
                return null;
        }
    }

    public int battleTypeOfMage(String typeMagic1, String typeMagic2) {
        switch (typeMagic1) {
            case type1:
                switch (typeMagic2) {
                    case type2:
                        return 1;
                    case type3:
                        return 2;
                }
                break;
            case type2:
                switch (typeMagic2) {
                    case type3:
                        return 1;
                    case type1:
                        return 2;
                }
                break;
            case type3:
                switch (typeMagic2) {
                    case type1:
                        return 1;
                    case type2:
                        return 2;
                }
                break;
        }
        return 0;
    }

    public boolean sameTypeOfMagic(String typeMagic1, String typeMagic2) {
        return typeMagic1.equals(typeMagic2);
    }

    // test method:
    public void lvlUp() {
        this.level++;
        this.damage++;
    }

    public static void mainSS(String[] args) {
        Mage mage1 = new Mage("Morbius", 80, 160, "ice");
        Mage mage2 = new Mage("Merlin", 80, 140, "ice");
        System.out.println(mage1.fight(mage2));
    }
    /*
⚡ Маг огня побеждает мага льда, но проигрывает магу земли.
⚡ Маг льда побеждает мага земли, но проигрывает магу огня.
⚡ Маг земли побеждает мага огня, но проигрывает магу льда.
⚡Если же стихия магов одинаковая, то выигрывает более высокоуровневый маг,
если же и уровни одинаковы, то тот, у которого больший урон, если же и урон одинаковый, то вернуть строку draw (ничья).
    */
}

//Module Praktika1 Zad_11
class TicTacToe {
    private String[][] field = new String[3][3];
    private String whoWinner = "W";
    private final String minusChar = "-";

    private int turn = 1;

    public TicTacToe() {
        newGame();
    }

    public void newGame() {
        turn = 1;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) field[x][y] = minusChar;
        }

    }

    public String[][] getField() {
        return field;
    }

    public String checkGame() {
        if (winLine()) return whoWinner;
        String drawChar = "D";
        if (fullField()) return drawChar;
        return null;
    }

    public String makeMove(int x, int y) {
        String s = checkGame();
        if (s != null) return "Game was ended";

        if (field[x - 1][y - 1].equals(minusChar)) {
            field[x - 1][y - 1] = turn % 2 == 1 ? "X" : "0";
            turn++;
        } else {
            return "Cell " + x + ", " + y + " is already occupied";
        }

        s = checkGame();
        if (s != null) {
            if (s.equals("X") || s.equals("0")) {
                return String.format("Player %s won", s);
            } else if (s.equals("D")) {
                return "Draw";
            }
        }
        return "Move completed";
    }


    private boolean winLine() {
        if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && !field[0][0].equals("-")) {
            whoWinner = field[0][0];
            return true;
        }
        if (field[1][0] == field[1][1] && field[1][1] == field[1][2] && !field[1][0].equals("-")) {
            whoWinner = field[1][0];
            return true;
        }
        if (field[2][0] == field[2][1] && field[2][1] == field[2][2] && !field[2][0].equals("-")) {
            whoWinner = field[2][0];
            return true;
        }

        if (field[0][0] == field[1][0] && field[1][0] == field[2][0] && !field[0][0].equals("-")) {
            whoWinner = field[0][0];
            return true;
        }
        if (field[0][1] == field[1][1] && field[1][1] == field[2][1] && !field[0][1].equals("-")) {
            whoWinner = field[0][1];
            return true;
        }
        if (field[0][2] == field[1][2] && field[1][2] == field[2][2] && !field[0][2].equals("-")) {
            whoWinner = field[0][2];
            return true;
        }

        if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && !field[0][0].equals("-")) {
            whoWinner = field[0][0];
            return true;
        }
        if (field[2][0] == field[1][1] && field[1][1] == field[0][2] && !field[2][0].equals("-")) {
            whoWinner = field[2][0];
            return true;
        }

        return false;
    }

    private boolean fullField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("-")) return false;
            }
        }
        return true;
    }


    /*
    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        board.newGame();
        System.out.println(Arrays.toString(board.getField()[0]) + "\n" + Arrays.toString(board.getField()[1]) + "\n" + Arrays.toString(board.getField()[2]));
        System.out.println(board.makeMove(1, 1));
        System.out.println(Arrays.toString(board.getField()[0]) + "\n" + Arrays.toString(board.getField()[1]) + "\n" + Arrays.toString(board.getField()[2]));
        System.out.println(board.makeMove(1, 1));
        System.out.println(board.makeMove(2, 1));
        System.out.println(Arrays.toString(board.getField()[0]) + "\n" + Arrays.toString(board.getField()[1]) + "\n" + Arrays.toString(board.getField()[2]));
        System.out.println(board.makeMove(1, 2));
        System.out.println(board.makeMove(2, 2));
        System.out.println(board.makeMove(1, 3));
        System.out.println(board.makeMove(2, 2));
        System.out.println(Arrays.toString(board.getField()[0]) + "\n" + Arrays.toString(board.getField()[1]) + "\n" + Arrays.toString(board.getField()[2]));
        System.out.print(board.checkGame() + " ");
        if (board.winLine()) {
            System.out.println("winner");
        }
    }
     */  //
}

//Module Praktika1 Zad_12  - SeaBoard отдельный класс
/*
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
*/

//Module Praktika1 Zad_13  -



















