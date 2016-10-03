package ru.geekbrains.java1.dz.dz2.ZharovAlexander;

import java.util.Arrays;
import java.util.Scanner;

/*
Домашнее задание
1.	Создать массив, состоящий из элементов 0 и 1, например, int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
2.	В массиве из предыдущего пункта с помощью цикла заменить 0 на 1, 1 на 0;
3.	Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;
4.	Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; пройти по нему циклом, и числа, которые меньше 6, умножить на 2.
5.	* Задать одномерный массив и найти в нем минимальный и максимальный элементы;
6.	** Написать простой консольный калькулятор. Пользователь вводит два числа и операцию, которую хочет выполнить, программа вычисляет результат и выводит в консоль;

 */
public class Main {
    public static void main(String[] args)
    {

        System.out.println("1. Создать массив, состоящий из элементов 0 и 1, например, int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };");
        int[] new_arr = {0,0,1,0,1,1,0,1,0,1,0};

        System.out.println("2. В массиве из предыдущего пункта с помощью цикла заменить 0 на 1, 1 на 0;");
        for(int i = 0; i < new_arr.length; i++)
        {
            int value = 0;
            if(new_arr[i] == 0)
            {
                value = 1;
            } else
            {
                value = 0;
            }
            System.out.println(new_arr[i] + " => " + value);

        }

        System.out.println("3. Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;");
        int[] array_3 = new int[8];
        for(int i = 0, val = 1; i < array_3.length; i++)
        {
            System.out.println("array_3["+i+"]" + " => " + val);
            array_3[i]=val;
            val += 3;
        }
        System.out.println("array_3[]: "+Arrays.toString(array_3));


        System.out.println("4. Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; пройти по нему циклом, и числа, которые меньше 6, умножить на 2.");
        int[] mass = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(mass.length);

        for(int num = 0; num < mass.length; num++)
        {
            if(num < 6)
            {
                System.out.println((num*2)+"("+num+"*2)");
            } else
            {
                System.out.println(num);
            }
        }

        System.out.println("5. Задать одномерный массив и найти в нем минимальный и максимальный элементы;");
        int[] mass5 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int max = mass5[0];
        int min = mass5[0];
        for(int i = 0; i < mass5.length; i++)
        {
            if(mass5[i] > max)
            {
                max = mass5[i];
            }
            if(mass5[i] < min)
            {
                min = mass5[i];
            }
        }
        System.out.println("Максимальное занчение: "+max);
        System.out.println("Минимальное занчение: "+min);

        System.out.println("6. Написать простой консольный калькулятор. Пользователь вводит два числа и операцию, которую хочет выполнить, программа вычисляет результат и выводит в консоль;");
        System.out.println("В другом классе");
    }
}
