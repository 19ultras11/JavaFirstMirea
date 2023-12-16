package ru.mirea.task8;

import java.util.ArrayList;
import java.util.Scanner;

public class number14 {
    public static void main(String[] args) {
        int number = 12345;
        printDigits(number);
    }

    // Рекурсивная функция для вывода цифр числа
    public static void printDigits(int n) {
        if (n < 10) {
            // Базовый случай: если число состоит из одной цифры, выводим её
            System.out.println(n);
        } else {
            // Рекурсивный случай: выводим последнюю цифру и вызываем функцию для оставшейся части числа
            printDigits(n / 10);
            System.out.println(n % 10);
        }
    }
}