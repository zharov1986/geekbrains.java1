package ru.geekbrains.java1.dz.dz3.ZharovAlexander;

/**
 * Created by User on 03.10.2016.
 */
public class TEST {

    private static char[][] TicTacToe =
            {
                    {'X','*','*'},
                    {'X','X','X'},
                    {'O','*','*'}
            };

    public static void main(String[] args)
    {
        int proverka = 0;

        for(int i = 0; i < 3; i++)
        {
            proverka = 0;

            for(int j = 0; j < 3; j++)
            {
                if(TicTacToe[i][j] == 'X')
                {
                    proverka++;
                }
            }
            if(proverka == 3)
            {
                System.out.println(proverka);
                break;
            }

        }
        if(proverka == 3)
        {
            System.out.println("Проверка пройдена");
        }
    }

}
