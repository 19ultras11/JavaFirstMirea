package ru.mirea.task6.number3;

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable car = new Car("Tesla");
        Nameable animal = new Animal("Dog");

        System.out.println(planet.getName());
        System.out.println(car.getName());
        System.out.println(animal.getName());
    }
}