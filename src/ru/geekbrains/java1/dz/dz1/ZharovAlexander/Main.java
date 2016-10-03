package ru.geekbrains.java1.dz.dz1.ZharovAlexander;

/*
Домашнее задание
1.	Создать пустой проект в IntelliJ IDEA и прописать метод main();
2.	Создать переменные всех пройденных типов данных, и инициализировать их значения;
3.	Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a,b,c,d – входные параметры этого метода.
4.	Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах 10 до 20, если да – вернуть true, в противном случае – false.
5.	* Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

public class Main
{
    //Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args)
    {
        System.out.println("2. Создать переменные всех пройденных типов данных, и инициализировать их значения");

        byte    a = 127;
        short   b = 32;
        int     c = 1;
        long    d = 1250000L;
        float   e = 125.5F;
        double  f = 128.5;
        boolean g = true;
        char    h = 'A';

        System.out.println("byte a = " + a);
        System.out.println("short b = " + b);
        System.out.println("int c = " + c);
        System.out.println("long d = " + d);
        System.out.println("float e = " + e);
        System.out.println("double f = " + f);
        System.out.println("boolean g = " + g);
        System.out.println("char h = " + h);



        System.out.println("3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a,b,c,d – входные параметры этого метода.");
        System.out.println("a * (b + (c / d)) = "+example1(10, 15, 36, 55));


        System.out.println("4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах 10 до 20, если да – вернуть true, в противном случае – false.");
        System.out.println("Високосный год? "+isLeapYear(2016));

    }


    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a,b,c,d – входные параметры этого метода.
    public static int example1(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах 10 до 20, если да – вернуть true, в противном случае – false.
    public static boolean example2(int a, int b) {
        if((a + b) >= 10 && (a + b) <= 20 )
        {
            return true;
        } else
        {
            return false;
        }
    }

    //Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    public static boolean isLeapYear(int god) {
       if(god%4 == 0 && god%100 !=0 && god != 400)
       {
           return true;
       } else
       {
           return false;
       }
    }



}
