package ru.mirea.task6.number10;

import java.util.Scanner;

public interface Input {
    Scanner scanner = new Scanner(System.in);

    static ComputerBrand enterBrand() {
        System.out.println("Введите марку компьютера (ACER, DELL, HP, ASUS): ");
        String input = scanner.nextLine().toUpperCase();
        return ComputerBrand.valueOf(input);
    }

    static Processor enterProcessor() {
        System.out.println("Введите модель процессора: ");
        String model = scanner.nextLine();
        return new Processor(model);
    }

    static Memory enterMemory() {
        System.out.println("Введите объем ОЗУ (в ГБ): ");
        int sizeGB = scanner.nextInt();
        scanner.nextLine();
        return new Memory(sizeGB);
    }

    static Monitor enterMonitor() {
        System.out.println("Введите тип монитора: ");
        String type = scanner.nextLine();
        return new Monitor(type);
    }
}