package by.konstantinVKLcorporation.lesson4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 3.
 * Очень желательно не делать это просто набором условий для каждой из возможных ситуаций
 */

public class Game {
    public static int countFishka;
    public static int field;
    public static int helpMass[] = new int[2];
    public static char[][] map;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



    public static void main(String[] args) throws IOException {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            computer();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Конец игры");
    }

    public static void initMap() throws IOException {
        System.out.println("Введите размерность игрового поля");
        field = Integer.parseInt(reader.readLine());
        System.out.println("Введите фишек, необходимых для победы");
        countFishka = Integer.parseInt(reader.readLine());
        map = new char[field][field];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {

        for (int i = 0; i <= field; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");

            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() throws IOException {
        int x, y;
        System.out.println("Введите координаты в формате X Y");
        x = Integer.parseInt(reader.readLine()) - 1;
        y = Integer.parseInt(reader.readLine()) - 1;



        helpMass[0] = x;
        helpMass[1] = y;
        while (!isCellValid(x, y)) ;
        map[x][y] = DOT_X;
    }

    public static boolean checkWin(char symb) throws IOException {
        if (horizontal(symb) || vertical(symb) || diagonalSecond(symb) || diagonalFirst(symb)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= field || y < 0 || y >= field) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static boolean diagonalFirst(char symb) {
        int count = 1;
        for (int i = 1, x = helpMass[0], y = helpMass[1]; x != 0 && y != 0; ) {

            if (map[x - i][y - i] == symb) {
                count++;
            } else {
                break;
            }
            x = x - i;
            y = y - i;
        }
        for (int i = 1, x = helpMass[0], y = helpMass[1]; y < map[0].length - 1 && x < map[0].length - 1; ) {
            if (map[x + i][y + i] == symb) {
                count++;
            } else {
                break;
            }
            x = x + i;
            y = y + i;
        }
        if (count >= countFishka) {
            System.out.println("Ура!!!Победа!");
            return true;
        }
        return false;
    }

    public static boolean diagonalSecond(char symb) {
        int count = 1;
        for (int i = 1, x = helpMass[0], y = helpMass[1]; x != 0 && y < map[0].length - 1; ) {

            if (map[x - i][y + i] == symb) {
                count++;
            } else {
                break;
            }
            x = x - i;
            y = y + i;
        }
        for (int i = 1, x = helpMass[0], y = helpMass[1]; y != 0 && x < map[0].length - 1; ) {
            if (map[x + i][y - i] == symb) {
                count++;
            } else {
                break;
            }
            x = x + i;
            y = y - i;
        }
        if (count >= countFishka) {
            System.out.println("Ура!!!Победа!");
            return true;
        }
        return false;
    }

    public static boolean horizontal(char symb) {
        int count = 1;
        for (int i = 1, x = helpMass[0], y = helpMass[1]; y < map[0].length - 1; ) {
            if (map[x][y + i] == symb) {
                count++;

            } else {
                break;
            }
            y = y + i;
        }

        for (int i = 1, x = helpMass[0], y = helpMass[1]; y != 0; ) {
            if (map[x][y - i] == symb) {
                count++;

            } else {
                break;
            }
            y = y - i;
        }
        if (count >= countFishka) {
            System.out.println("Ура!!!Победа!");
            return true;
        }
        return false;
    }

    public static boolean vertical(char symb) {
        int count = 1;
        for (int i = 1, x = helpMass[0], y = helpMass[1]; x != 0; ) {
            if (map[x - i][y] == symb) {
                count++;

            } else {
                break;
            }
            x = x - i;
        }
        for (int i = 1, x = helpMass[0], y = helpMass[1]; x < map[0].length - 1; ) {
            if (map[x + i][y] == symb) {
                count++;

            } else {
                break;
            }
            x = x + i;
        }
        if (count >= countFishka) {
            System.out.println("Ура!!!Победа!");
            return true;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < field; i++) {
            for (int j = 0; j < field; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void computer() throws IOException {

        int x;
        int y;
        do {
            x = (int) (Math.random() * field);
            y = (int) (Math.random() * field);
            helpMass[0] = x;
            helpMass[1] = y;
        }
        while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

    public static void artificialIntelligence(){
        diagonalFirst(DOT_X);


    }
}
