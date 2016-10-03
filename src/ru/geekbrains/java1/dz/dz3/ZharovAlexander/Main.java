package ru.geekbrains.java1.dz.dz3.ZharovAlexander;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //Задаем переменные
    private static final int SIZE = 5;
    private static final int FINAL_SIZE = 4;
    private static char[][] TicTacToe = new char[SIZE][SIZE];
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random(); // генератор случайных чисел
    private static final char playerDote = 'X';
    private static final char computerDote = 'O';
    private static final char emptyDote = '*';

    // ФУНКЦИЯ MAIN
    public static void main(String[] args)
    {
        ititTicTacToe();
        printTicTacToe();

        // запускаем игровой цикл
        while (true)
        {
            turn("human",playerDote); //делает ход человек
            //humanTurn(); // ход человека
            printTicTacToe(); // печать поля
            //проверяем победу
            if (checkWin(playerDote))
            {
                System.out.println("Победил игрок");
                break;
            }
            // если поле заполнилось, завершаем игру
            if (isMapFull())
            {
                System.out.println("Поле полностью заполнилось, никто не выиграл");
                break;
            };
            turn("computer",computerDote); // делает ход компьютер
            //aiTurn(); // ход компьютера
            printTicTacToe(); // печать поля
            //проверяем победу
            if (checkWin(computerDote))
            {
                System.out.println("Победил компьютер");
                break;
            }
            // если поле заполнилось, завершаем игру
            if (isMapFull())
            {
                System.out.println("Поле полностью заполнилось, никто не выиграл");
                break;
            };
        }

    }



    //Инициализируем TicTacToe и заполняем массив звездочками
    private static void ititTicTacToe()
    {
        for(int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                TicTacToe[i][j] = emptyDote;
            }
        }
    }

    //Рисуем TicTacToe
    public static void printTicTacToe()
    {
        for(int header = 0; header <= SIZE; header++)
        {
            System.out.print(header+"\t");
        }
        System.out.println();
        for(int i = 0; i < SIZE; i++)
        {
            System.out.print((i+1) + "\t");
            for(int j = 0; j < SIZE; j++)
            {
                System.out.print(TicTacToe[i][j] + "\t");
            }
            System.out.println();
        }
    }


    // ХОД КОМПЬЮТЕРА И ЧЕЛОВЕКА
    public static void turn(String type_player, char dote_player)
    {
        // инициализируем X, Y
        int x, y;
        do
        {
            if(type_player == "human")
            {
                System.out.println("Введите координаты в формате: X пробел Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } else
            {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            }
        }
        while (!isCellEmpty(x, y)); //Проверяем до тех по, пока метод не вернут true
        TicTacToe[y][x] = dote_player;
        System.out.println("Ходит " + type_player + " (x = " + (x+1) + ", y = " + (y+1) + ")");
    }

    // ХОД ЧЕЛОВЕКА
    public static void humanTurn()
    {
        // инициализируем X, Y
        int x, y;
        do
        {
            System.out.println("Введите координаты в формате: X пробел Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!isCellEmpty(x, y)); //Проверяем до тех по, пока метод не вернут true
        TicTacToe[y][x] = playerDote;
    }

    // ХОД КМПЬЮТЕРА
    public static void aiTurn()
    {
        // инициализируем X, Y
        int x, y;
        do
        {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }
        while (!isCellEmpty(x, y)); //Проверяем до тех по, пока метод не вернут true
        System.out.println("Компьютер ввел координаты: " + (x + 1) + " и " + (y + 1));
        TicTacToe[y][x] = computerDote;
    }


    // проверка является ли ячейка свободной
    public static boolean isCellEmpty(int x, int y)
    {
        if(x < 0 || x > (SIZE-1) || y < 0 || y > (SIZE-1)|| TicTacToe[y][x] != emptyDote) return false;
        return true;
    }

    // проверяем на заполненность поля
    public static boolean isMapFull()
    {
        for(int i = 0; i < SIZE; i++)
        {
            for(int j = 0; j < SIZE; j++)
            {
                if(TicTacToe[j][i] == emptyDote) return false;
            }
        }
        return true;
    }

    // Проверяем победу
    public static boolean checkWin(char ox) {

        int proverka = 0;
        int proverka_diagonal = 0;

        for(int i = 0; i < SIZE; i++)
        {
            proverka = 0;
            proverka_diagonal = 0;
            if(TicTacToe[i][i] == ox)
            {
                proverka_diagonal++;
            }


            if(proverka_diagonal == FINAL_SIZE)
            {
                break;
            }

            for(int j = 0; j < SIZE; j++)
            {
                if(TicTacToe[j][i] == ox)
                {
                    proverka++;
                }
            }
            if(proverka == FINAL_SIZE)
            {
                break;
            }

        }
        if(proverka == FINAL_SIZE || proverka_diagonal == FINAL_SIZE)
        {
            return true;
        } else
        {
            return false;
        }


//        // Ищем заполненные горизонтальные линии
//        if (TicTacToe[0][0] == ox && TicTacToe[0][1] == ox && TicTacToe[0][2] == ox) return true;
//        if (TicTacToe[1][0] == ox && TicTacToe[1][1] == ox && TicTacToe[1][2] == ox) return true;
//        if (TicTacToe[2][0] == ox && TicTacToe[2][1] == ox && TicTacToe[2][2] == ox) return true;
//        // Ищем заполненные вертикальные линии
//        if (TicTacToe[0][0] == ox && TicTacToe[1][0] == ox && TicTacToe[2][0] == ox) return true;
//        if (TicTacToe[0][1] == ox && TicTacToe[1][1] == ox && TicTacToe[2][1] == ox) return true;
//        if (TicTacToe[0][2] == ox && TicTacToe[1][2] == ox && TicTacToe[2][2] == ox) return true;
//        // Ищем заполненные диагональные линии
//        if (TicTacToe[0][0] == ox && TicTacToe[1][1] == ox && TicTacToe[2][2] == ox) return true;
//        if (TicTacToe[2][0] == ox && TicTacToe[1][1] == ox && TicTacToe[0][2] == ox) return true;
//        return false;        // если ни одной линии не нашли, значит игрок еще не победил
    }



}
