package ru.mirea.task7.number4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MathFunc mathFunc = new MathFunc();
        double radius = in.nextDouble();
        double circumference = 2 * mathFunc.PI * radius;
        System.out.println("Длина окружности: " + circumference);
    }
}