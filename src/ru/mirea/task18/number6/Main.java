package ru.mirea.task18.number6;

public class Main {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();

        demo.printMessage("someKey");

        try {
            demo.printMessage(null);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}