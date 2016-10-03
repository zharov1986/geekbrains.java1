package ru.geekbrains.java1.dz.dz2.ZharovAlexander;

import java.util.Scanner;

/**
 * Created by User on 30.09.2016.
 */
public class Calculator {
    public static void main(String[] args)
    {
        Scanner calc = new Scanner(System.in);

        System.out.println("Введите число 1");
        double a = calc.nextDouble();

        System.out.println("Введите число 2");
        double b = calc.nextDouble();

        System.out.println("Введите оператор ('+', '-', '*' или '/')");
        String operator = calc.next();
        switch (operator)
        {
            case "+":
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case "-":
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case "*":
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case "/":
                if(b != 0)
                {
                    System.out.println(a+"/"+b+"="+(a/b));
                } else
                {
                    System.out.println("Деление на НОЛЬ запрещено");
                }
                break;
            default:
                System.out.println("Введен недопустимый оператор");
        }
    }
}